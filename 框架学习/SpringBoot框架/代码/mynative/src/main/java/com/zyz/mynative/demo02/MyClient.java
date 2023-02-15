package com.zyz.mynative.demo02;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 11:06
 * @Description:
 */


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * C/S架构的客户端对象，持有该对象，可以随时向服务端发送消息。
 *
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 11:06
 * @Description:
 */
public class MyClient {

    /**
     * 处理服务端发回的对象，可实现该接口。
     */
    public static interface ObjectAction {
        void doAction(Object obj, MyClient client);
    }

    public static final class DefaultObjectAction implements ObjectAction {
        @Override
        public void doAction(Object obj, MyClient client) {
            System.out.println("处理：\t" + obj.toString());
        }
    }


    private String serverIp;
    private int port;
    private Socket socket;
    //连接状态
    private boolean running = false;

    //最后一次发送数据的时间
    private long lastSendTime;

    //用于保存接收消息对象类型及该类型消息处理的对象
    private ConcurrentHashMap<Class, ObjectAction> actionMapping = new ConcurrentHashMap<Class, ObjectAction>();

    public MyClient(String serverIp, int port) {
        this.serverIp = serverIp;
        this.port = port;
    }

    public void start() throws UnknownHostException, IOException {
        if (running) {
            return;
        }
        socket = new Socket(serverIp, port);
        System.out.println("本地端口：" + socket.getLocalPort());
        lastSendTime = System.currentTimeMillis();
        running = true;
        //保持长连接的线程，每隔2秒项服务器发一个一个保持连接的心跳消息
        new Thread(new KeepAliveWatchDog()).start();
        //接受消息的线程，处理消息
        new Thread(new ReceiveWatchDog()).start();
    }

    public void stop() {
        if (running) {
            running = false;
        }
        ;
    }

    /**
     * 添加接收对象的处理对象。
     *
     * @param cls    待处理的对象，其所属的类。
     * @param action 处理过程对象。
     */
    public void addActionMap(Class<Object> cls, ObjectAction action) {
        actionMapping.put(cls, action);
    }

    public void sendObject(Object obj) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(obj);
        System.out.println("发送：\t" + obj);
        oos.flush();
    }

    class KeepAliveWatchDog implements Runnable {
        long checkDelay = 10;
        long keepAliveDelay = 2000;

        @Override
        public void run() {
            while (running) {
                if (System.currentTimeMillis() - lastSendTime > keepAliveDelay) {
                    try {
                        MyClient.this.sendObject(new KeepAlive());
                    } catch (IOException e) {
                        e.printStackTrace();
                        MyClient.this.stop();
                    }
                    lastSendTime = System.currentTimeMillis();
                } else {
                    try {
                        Thread.sleep(checkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        MyClient.this.stop();
                    }
                }
            }
        }
    }

    class ReceiveWatchDog implements Runnable {
        @Override
        public void run() {
            while (running) {
                try {
                    InputStream in = socket.getInputStream();
                    if (in.available() > 0) {
                        ObjectInputStream ois = new ObjectInputStream(in);
                        Object obj = ois.readObject();
                        System.out.println("接收：\t" + obj);
                        ObjectAction oa = actionMapping.get(obj.getClass());
                        oa = oa == null ? new DefaultObjectAction() : oa;
                        oa.doAction(obj, MyClient.this);
                    } else {
                        Thread.sleep(10);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MyClient.this.stop();
                }
            }
        }
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        String serverIp = "127.0.0.1";
        int port = 65432;
        MyClient client = new MyClient(serverIp, port);
        client.start();
    }
}
