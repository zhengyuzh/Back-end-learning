package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 23:07
 * @Description:
 */
/**
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComBox() {
        return new SpringComboBox();
    }
}

