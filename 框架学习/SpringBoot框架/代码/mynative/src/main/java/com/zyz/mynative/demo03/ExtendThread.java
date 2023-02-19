package com.zyz.mynative.demo03;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 15:51
 * @Description:继承Thread类,重写run方法(不推荐,因为java的单继承局限性)
 */
public class ExtendThread extends Thread {

    /*
     * 创建步骤如下：
     * 1，定义Thread类的子类，并重写该类的run()方法，该run()方法的方法体就代表了线程需要完成的任务。因此把run方法称为线程执行体。
     * 2，创建Thread子类了的实例，即创建线程对象。本实例中是new一个ExtendThread，即可创建线程对象，也就是开启了一个线程
     * 3，调用线程对象的start()方法来启动该线程。
     *
     * 调用示例：
     * //循环10次即开启10个线程
     * for (int i = 0; i < 10; i++) {
     *     ExtendThread extendThread = new ExtendThread();
     *     extendThread.start();
     * }
     * */

    public static void main(String[] args) {
        ExtendThread thread = new ExtendThread();
        thread.start();
    }

    /**
     * 重写Thread类的run()，这个方法称为线程执行体
     */
    @Override
    public void run() {
        doSomething();
    }

    /**
     * 需要处理的任务
     */
    public void doSomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}