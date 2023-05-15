package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/15 16:51
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Component component ,componentSB;   //使用抽象构件定义
        component = new Window();   //定义具体构件
        componentSB = new ScrollBarDecorator(component);//定义装饰后的构件
        componentSB.display();
    }
}
