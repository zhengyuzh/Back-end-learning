package com.atguigu.java2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/18 12:16
 * @Description:
 */
public class MyClient {
    public static void main(String[] args) throws IOException {
        //1、准备Scoket，连接服务器，需要指定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        //3、获取输出流，用来发送数据给服务器
        OutputStream outputStream = socket.getOutputStream();

        //2、获取输入流，用来接收服务器发给客户端的数据
        InputStream inputStream = socket.getInputStream();


        //4、通信   先发送，后接收。否则阻塞，同服务端相反
        //发送数据
        outputStream.write("你好，我是客户端发来的数据".getBytes());
        outputStream.flush();
        socket.shutdownOutput();
        //会在流末写一个“流的末尾”标记，对方才能读到-1，否则对方的读取方法会一直阻塞

        //接收数据
        byte[] data = new byte[1024];
        int len;
        while ((len = inputStream.read(data)) != -1) {
            System.out.println(new String(data, 0, len));
        }


        //5、关闭socket，不再与服务器通信，即断开与服务器的连接
        //socker关闭，意味着InputStream和OutputStrem也关闭了
        socket.close();
    }


}
