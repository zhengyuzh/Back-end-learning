package com.zyz.demo1;

import com.zyz.demo1.config.XMLUtil;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 23:08
 * @Description:
 */
public class Client1 {
    public static void main(String[] args) {
        Button button;
        TextField textField;
        ComboBox comboBox;
        SkinFactory skinFactory;

        skinFactory = (SkinFactory) XMLUtil.getBean();
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
