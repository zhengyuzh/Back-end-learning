package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/26 17:11
 * @Description:
 */
abstract class Mediator {
    public abstract void componentChanged(Component c);
}


//具体中介者

class ConcreteMediator extends Mediator {
    /**
     * 维持对各个同事对象的引用
     */
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    /**
     * 封装同事对象之间的交互
     *
     * @param c
     */
    @Override
    public void componentChanged(Component c) {
        //单击按钮
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        //从列表框选择客户
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}


//新增具体中介者类

class SubConcreteMediator extends ConcreteMediator {
    //增加对Label对象的引用
    public Label label;

    @Override
    public void componentChanged(Component c) {
        //单击按钮
        if(c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update(); //文本标签更新
        }
        //从列表框选择客户
        else if(c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if(c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}

//抽象组件类：抽象同事类

abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}


//按钮类：具体同事类

class Button extends Component {
    @Override
    public void update() {
        //按钮不产生交互
    }
}


//列表框类：具体同事类

class List extends Component {
    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }
}


//组合框类：具体同事类

class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}


//文本框类：具体同事类

class TextBox extends Component {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }
}


//文本标签类：具体同事类

class Label extends Component {
    @Override
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加1。");
    }
}
