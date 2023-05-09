package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 12:59
 * @Description: 客户端使用具体工厂创建具体产品
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        //创建具体工厂
        factory = new DatabaseLoggerFactory();
        //创建具体产品
        logger = factory.createLogger();
        logger.writeLog();
    }
}
