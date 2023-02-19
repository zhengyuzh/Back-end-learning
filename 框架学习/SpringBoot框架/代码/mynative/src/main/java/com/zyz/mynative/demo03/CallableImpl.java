package com.zyz.mynative.demo03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 16:08
 * @Description:
 */
public class CallableImpl implements Callable<String> {

    /*
     * 创建步骤如下：
     * 1，定义实现Callable<V>接口的实现类，实现call方法，这个方法是线程执行体
     * 2，创建Callable<V>实现类的实例，借助FutureTask得到线程执行的返回值
     * 3，将FutureTask的实例，作为Thread的target来创建Thread类
     * 4，调用start方法，开启线程
     *
     * 调用示例：
     * Callable<String> tc = new CallableImpl();
     * FutureTask<String> task = new FutureTask<>(tc);
     * new Thread(task).start();
     * try {
     *     System.out.println(task.get());
     * } catch (InterruptedException | ExecutionException e) {
     *     e.printStackTrace();
     * }
     *
     * 说明：
     * 1.与使用Runnable相比， Callable功能更强大些
     * 2.实现的call()方法相比run()方法，可以返回值
     * 3.方法可以抛出异常
     * 4.支持泛型的返回值
     * 5.需要借助FutureTask类，比如获取返回结果
     * Future接口可以对具体Runnable、Callable任务的执行结果进行取消、查询是否完成、获取结果等。
     * FutureTask是Futrue接口的唯一的实现类
     * FutureTask 同时实现了Runnable, Future接口。它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值
     *
     * */


    public static void main(String[] args) {
        Callable<String> tc = new CallableImpl();
        FutureTask<String> task = new FutureTask<>(tc);
        new Thread(task).start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private int ticket = 5;

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(doSomething());
        }

        return "出票任务完成";
    }

    public String doSomething() {
        String result = "";
        if (this.ticket > 0) {
            result = "出票成功，ticket=" + this.ticket--;
        } else {
            result = "出票失败，ticket=" + this.ticket;
        }
        return result;
    }
}
