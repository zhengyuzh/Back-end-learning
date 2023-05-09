package com.zyz;

import com.zyz.config.XMLUtil;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 0:34
 * @Description: 通过读取xml配置文件，来完成对象创建
 */
public class Client2 {
    public static void main(String[] args) {
        Chart chart;
        //读取配置文件中的参数
        String type = XMLUtil.getChartType();
        //创建产品对象
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
