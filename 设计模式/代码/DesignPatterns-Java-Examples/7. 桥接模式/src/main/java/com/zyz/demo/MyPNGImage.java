package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 21:46
 * @Description: PNG格式图像：扩充抽象类
 */
public  class MyPNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
