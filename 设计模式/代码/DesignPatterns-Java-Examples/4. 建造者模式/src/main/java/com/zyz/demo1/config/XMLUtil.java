package com.zyz.demo1.config;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/10 16:55
 * @Description: 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
 */
public class XMLUtil {

    public static Object getBean() {
        try {
            String path = "F:\\java学习资料(后端)\\github管理后端学习资料\\后端学习\\设计模式\\代码\\DesignPatterns-Java-Examples\\4. 建造者模式\\src\\main\\resources\\config.xml";
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName("com.zyz.demo1." + cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}