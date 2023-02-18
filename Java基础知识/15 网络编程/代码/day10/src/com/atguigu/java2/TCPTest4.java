package com.atguigu.java2;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/18 12:39
 * @Description:
 */
public class TCPTest4 {

    @Test
    public void Myclient() throws IOException {
        //1、准备Scoket，连接服务器，需要指定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        //3、获取输出流，用来发送数据给服务器
        OutputStream outputStream = socket.getOutputStream();

        //2、获取输入流，用来接收服务器发给客户端的数据
        InputStream inputStream = socket.getInputStream();

        //4、通信

        //发送数据
        outputStream.write("你好，我是客户端发来的数据".getBytes());
        outputStream.flush();
        socket.shutdownOutput();
        //会在流末写一个“流的末尾”标记，对方才能读到-1，否则对方的读取方法会一直阻塞

        //4、接收
        byte[] data = new byte[1024];
        int len;
        while ((len = inputStream.read(data)) != -1) {
            System.out.println(new String(data, 0, len));
        }

        //5、关闭socket，不再与服务器通信，即断开与服务器的连接
        //socker关闭，意味着InputStream和OutputStrem也关闭了
        socket.close();

    }

    @Test
    public void MyServer() throws IOException {
        //1、准备一个ServerSocker
        ServerSocket serverSocket = new ServerSocket(8888);

        //2、监听一个客户端的连接。accept()是一个阻塞的方法，如果没有客户端连接，将一直等待
        Socket socket = serverSocket.accept();
        System.out.println("一个客户端连接成功");

        //3、获取输出流，用来发送数据给客户端
        OutputStream outputStream = socket.getOutputStream();

        //获取输入流，用来接收客户端发送给服务器的数据
        InputStream inputStream = socket.getInputStream();

        //4、通信

        //接收数据
        byte[] data = new byte[1024];
        int len;
        while ((len=inputStream.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }

        //发送数据
        outputStream.write("我是服务端发来的信息".getBytes());
        outputStream.flush();
        socket.shutdownOutput();

        //socker关闭，意味着InputStream和OutputStrem也关闭了
        socket.close();

        //6、如果不在接收任何客户端通信，可以关闭ServerSocker
        serverSocket.close();
    }
}
