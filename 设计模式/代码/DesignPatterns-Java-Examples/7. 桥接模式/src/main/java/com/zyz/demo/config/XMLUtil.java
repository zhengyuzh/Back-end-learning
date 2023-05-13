package com.zyz.demo.config;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 21:43
 * @Description:
 */
public class XMLUtil {
    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     * @param args
     * @return
     */
    public static Object getBean(String args) {
        try {
            String path = "F:\\java学习资料(后端)\\github管理后端学习资料\\后端学习\\设计模式\\代码\\DesignPatterns-Java-Examples\\7. 桥接模式\\src\\main\\resources\\config.xml";
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));
            NodeList nl=null;
            Node classNode=null;
            String cName=null;
            nl = doc.getElementsByTagName("className");

            if(args.equals("image")) {
                //获取第一个包含类名的节点，即扩充抽象类
                classNode=nl.item(0).getFirstChild();

            }
            else if(args.equals("os")) {
                //获取第二个包含类名的节点，即具体实现类
                classNode=nl.item(1).getFirstChild();
            }

            cName=classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c=Class.forName("com.zyz.demo." + cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}