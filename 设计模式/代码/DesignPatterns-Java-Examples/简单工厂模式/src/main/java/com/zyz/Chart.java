package com.zyz;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/8 23:48
 * @Description:Chart接口充当抽象产品类，其子类HistogramChart、PieChart
 *                     和LineChart充当具体产品类，ChartFactory充当工厂类
 */

/**
 * 抽象产品
 */
interface Chart {
    /**
     * 展示图表
     */
    public void display();
}


/**
 * 柱状图类：具体产品类
 */
class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }


}

/**
 * 饼状图类：具体产品类
 */
class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}

/**
 * 折线图类：具体产品类
 */
class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}


/**
 * 图表工厂类：工厂类
 */
class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}