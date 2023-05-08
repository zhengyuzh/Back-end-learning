package com.zyz.config;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 0:33
 * @Description:
 */
public class XMLUtil {
    /**
     * 该方法用于从XML配置文件中提取图表类型，并返回类型名
     * @return
     */
    public static String getChartType() {
        String path = "F:\\java学习资料(后端)\\github管理后端学习资料\\后端学习\\设计模式\\代码\\DesignPatterns-Java-Examples\\简单工厂模式\\src\\main\\resources\\config.xml";
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));

            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
