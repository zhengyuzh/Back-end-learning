package com.zyz.mynative.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 9:36
 * @Description:　RPC服务注册中心：
 */
public class ServiceCenter {

    private ExecutorService executor = Executors.newFixedThreadPool(20);

    private final ConcurrentHashMap<String, Class> serviceRegistry = new ConcurrentHashMap<String, Class>();

    private AtomicBoolean isRunning = new AtomicBoolean(true);

    // 服务器监听端口
    private int port = 8089;

    // 心跳监听器
    HeartbeatLinstener linstener;

    // 单例模式
    private static class SingleHolder {
        private static final ServiceCenter INSTANCE = new ServiceCenter();
    }

    private ServiceCenter() {
    }

    public static ServiceCenter getInstance() {
        return SingleHolder.INSTANCE;
    }

    public void register(Class serviceInterface, Class impl) {
        System.out.println("regeist service " + serviceInterface.getName());
        serviceRegistry.put(serviceInterface.getName(), impl);
    }

    public void start() throws IOException {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(port));
        System.out.println("start server");
        linstener = HeartbeatLinstener.getInstance();
        System.out.println("start listen heart beat");
        try {
            while (true) {
                // 1.监听客户端的TCP连接，接到TCP连接后将其封装成task，由线程池执行
                executor.execute(new ServiceTask(server.accept()));
            }
        } finally {
            server.close();
        }
    }

    public void stop() {
        isRunning.set(false);
        executor.shutdown();
    }


    public boolean isRunning() {
        return isRunning.get();
    }

    public int getPort() {
        return port;
    }

    public void settPort(int port) {
        this.port = port;
    }

    public ConcurrentHashMap<String, Class> getServiceRegistry() {
        return serviceRegistry;
    }

    private class ServiceTask implements Runnable {
        Socket clent = null;

        public ServiceTask(Socket client) {
            this.clent = client;
        }

        @Override
        public void run() {
            ObjectInputStream input = null;
            ObjectOutputStream output = null;
            try {
                // 2.将客户端发送的码流反序列化成对象，反射调用服务实现者，获取执行结果
                input = new ObjectInputStream(clent.getInputStream());
                String serviceName = input.readUTF();
                String methodName = input.readUTF();
                Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
                Object[] arguments = (Object[]) input.readObject();
                Class serviceClass = serviceRegistry.get(serviceName);
                if (serviceClass == null) {
                    throw new ClassNotFoundException(serviceName + " not found");
                }
                Method method = serviceClass.getMethod(methodName, parameterTypes);
                Object result = method.invoke(serviceClass.newInstance(), arguments);

                // 3.将执行结果反序列化，通过socket发送给客户端
                output = new ObjectOutputStream(clent.getOutputStream());
                output.writeObject(result);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (clent != null) {
                    try {
                        clent.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
