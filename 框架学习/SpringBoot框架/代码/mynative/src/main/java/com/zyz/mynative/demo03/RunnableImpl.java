package com.zyz.mynative.demo03;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 15:57
 * @Description:
 */
public class RunnableImpl implements Runnable {

    /*
     * 创建步骤如下：
     * 1，定义Runnable接口的实现类，并且实现run方法，这个方法同样是线程执行体
     * 2，创建Runnable实现类的实例，并以此实例对象作为Thread的target来创建Thread类，这个新创建的Thread对象才是真正的线程对象，即开启了新的线程
     * 3，调用线程对象的start()方法来开启该线程
     *
     * 调用示例：
     * //开启10个线程
     * for (int i = 0; i < 10; i++) {
     *     Thread thread = new Thread(new RunnableImpl());
     *     thread.start();
     * }
     * */

    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();

        /**
         * 简写
         * new Thread(runnable).start();
         */

    }

    /**
     * 实现Runnable接口的run方法，这个方法称为线程执行体
     * */
    @Override
    public void run() {
        doSomething();
    }

    /**
     * 需要处理的任务
     * */
    private void doSomething(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}