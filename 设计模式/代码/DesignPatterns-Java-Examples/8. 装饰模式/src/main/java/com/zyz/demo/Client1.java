package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/15 17:10
 * @Description:
 */
public class Client1 {
    public static void main(String[] args) {
        Component component,component1,component2;
        component = new Window();
        component1 = new ScrollBarDecorator(component);

        component2 = new BlackBorderDecorator(component1);
        component2.display();
    }
}
