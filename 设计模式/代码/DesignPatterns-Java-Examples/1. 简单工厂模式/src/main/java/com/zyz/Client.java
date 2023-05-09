package com.zyz;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/8 23:57
 * @Description: 客户端代码
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;

        /**
         * 循环创建
         */
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                //创建柱状图   通过静态工厂方法创建产品
                chart = ChartFactory.getChart("histogram");
                chart.display();
                System.out.println("===============================");
            } else if (i == 1) {
                //创建饼状图
                chart = ChartFactory.getChart("pie");
                chart.display();
                System.out.println("===============================");
            } else if (i == 2) {
                //创建折线图
                chart = ChartFactory.getChart("line");
                chart.display();
                System.out.println("===============================");
            } else {
                //创建折线图
                chart = ChartFactory.getChart("LINE");
                chart.display();
                System.out.println("==============大写的LINE=================");
            }

        }
    }
}
