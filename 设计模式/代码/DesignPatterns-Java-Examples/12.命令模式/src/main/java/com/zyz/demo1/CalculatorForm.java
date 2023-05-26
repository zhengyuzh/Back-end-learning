package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/26 12:12
 * @Description:
 */
//计算器界面类：请求发送者

class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    /**
     * 调用命令对象的execute()方法执行运算
     * @param value
     */
    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，运算结果为：" + i);
    }

    /**
     * 调用命令对象的undo()方法执行撤销
     */
    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }
}


//抽象命令类

abstract class AbstractCommand {
    public abstract int execute(int value); //声明命令执行方法execute()
    public abstract int undo(); //声明撤销方法undo()
}


//具体命令类

class ConcreteCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    /**
     * 实现抽象命令类中声明的execute()方法，调用加法类的加法操作
     * @param value
     * @return
     */
    @Override
    public int execute(int value) {
        this.value=value;
        return adder.add(value);
    }

    /**
     * 实现抽象命令类中声明的undo()方法，通过加一个相反数来实现加法的逆向操作
     * @return
     */
    @Override
    public int undo() {
        return adder.add(-value);
    }
}


//加法类：请求接收者

class Adder {
    private int num=0; //定义初始值为0

    /**
     * 加法操作，每次将传入的值与num作加法运算，再将结果返回
     * @param value
     * @return
     */
    public int add(int value) {
        num += value;
        return num;
    }
}