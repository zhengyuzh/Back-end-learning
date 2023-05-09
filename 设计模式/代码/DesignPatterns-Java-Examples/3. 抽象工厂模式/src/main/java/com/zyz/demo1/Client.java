package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 22:44
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Button button;
        TextField textField;
        ComboBox comboBox;
        SkinFactory skinFactory;

        skinFactory = new SpringSkinFactory();
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
