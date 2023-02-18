package com.zyz.mynative.demo03;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 15:57
 * @Description:
 */
public class RunnableImpl2 {

    /*
     * 创建步骤如下：
     * 匿名内部类本质上也是一个类实现了Runnable接口，重写了run方法，只不过这个类没有名字，直接作为参数传入Thread类
     *
     * 调用示例：
     * //开启10个线程
     * for (int i = 0; i < 10; i++) {
     *     Anonymous anonymous =new Anonymous();
     *     anonymous.myRun();
     * }
     *
     * */
    public static void main(String[] args) {
        RunnableImpl2 test = new RunnableImpl2();
        test.myRun();
    }

    public void myRun(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                doSomething();
            }
        }).start();
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