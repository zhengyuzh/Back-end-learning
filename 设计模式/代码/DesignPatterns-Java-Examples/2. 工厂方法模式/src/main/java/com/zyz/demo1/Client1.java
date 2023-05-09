package com.zyz.demo1;

import com.zyz.config.XMLUtil;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 13:36
 * @Description:
 */
public class Client1 {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        //getBean()的返回类型为Object，需要进行强制类型转换
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();

    }
}
