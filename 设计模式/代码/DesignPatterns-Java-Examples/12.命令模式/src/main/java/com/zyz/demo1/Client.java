package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/26 12:15
 * @Description:
 */
class Client {
    public static void main(String args[]) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        form.setCommand(command); //向发送者注入命令对象

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
