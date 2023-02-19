package com.zyz.mynative.demo03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 16:11
 * @Description:
 */
public class ThreadPool implements Runnable {

    /*
     * 创建步骤如下：
     * 1，定义Runnable接口的实现类，或者定义（继承Runnable接口的类）的实现类，并且实现run方法，这个方法是线程执行体
     * 2，创建一个自定义线程个数的线程池
     * 3，实例化Runnable接口的实现类
     * 4，将3步的实例，作为线程池实例的execute方法的command参数，开启线程
     * 5，关闭线程池
     *
     * 调用示例：
     * ExecutorService pool = Executors.newFixedThreadPool(2);
     * ThreadPool threadPool = new ThreadPool("AA");
     * ThreadPool threadPoo2 = new ThreadPool("BB");
     * pool.execute(threadPool);
     * pool.execute(threadPoo2);
     * pool.shutdown();
     *
     * 说明：
     * 示例中创建的是2个线程的线程池
     * execute方法是开启线程方法，实参要求是实现Runnable的类。所以，继承Thread类的子类也可以以线程池的方式开启线程
     *
     * */

    public static void main(String[] args) {
      ExecutorService pool = Executors.newFixedThreadPool(2);
      ThreadPool threadPool = new ThreadPool("AA");
      ThreadPool threadPoo2 = new ThreadPool("BB");
      pool.execute(threadPool);
      pool.execute(threadPoo2);
      pool.shutdown();
    }

    String name;
    public ThreadPool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        doSomething();
    }

    /**
     * 需要处理的任务
     * */
    private void doSomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i + "，name=" + this.name);
        }
    }
}
