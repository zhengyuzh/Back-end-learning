package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 21:45
 * @Description:
 */
/**
 * Unix操作系统实现类：具体实现类
 */
public  class MyUnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        System.out.print("在Unix操作系统中显示图像：");
    }
}
