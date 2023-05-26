package com.zyz.demo;

import java.util.ArrayList;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/25 18:24
 * @Description:
 */

//功能键设置窗口类

class FBSettingWindow {
    private String title; //窗口标题
    /**
     * 定义一个ArrayList来存储所有功能键
     */
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }


    /**
     * 显示窗口及功能键
     */
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton) obj).getName());
        }
        System.out.println("------------------------------");
    }

}


//功能键类：请求发送者

class FunctionButton {
    private String name; //功能键名称
    private Command command; //维持一个抽象命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * 为功能键注入命令
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 发送请求的方法
     */
    public void onClick() {
        System.out.print("点击功能键盘：");
        command.execute();
    }


}

//抽象命令类

abstract class Command {
    public abstract void execute();
}


//帮助命令类：具体命令类

class HelpCommand extends Command {
    private HelpHandler hhObj; //维持对请求接收者的引用

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    @Override
    public void execute() {
        hhObj.display();
    }
}


//最小化命令类：具体命令类

class MinimizeCommand extends Command {
    private WindowHanlder whObj; //维持对请求接收者的引用

    public MinimizeCommand() {
        whObj = new WindowHanlder();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    @Override
    public void execute() {
        whObj.minimize();
    }
}


//窗口处理类：请求接收者

class WindowHanlder {
    public void minimize() {
        System.out.println("将窗口最小化至托盘！");
    }
}

//帮助文档处理类：请求接收者

class HelpHandler {
    public void display() {
        System.out.println("显示帮助文档！");
    }
}