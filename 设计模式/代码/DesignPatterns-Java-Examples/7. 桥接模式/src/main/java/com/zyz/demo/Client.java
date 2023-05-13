package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 20:56
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = new JPGImage();
        imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
