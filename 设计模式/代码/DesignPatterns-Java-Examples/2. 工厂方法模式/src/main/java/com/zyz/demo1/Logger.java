package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/9 12:51
 * @Description: 抽象产品：具体产品。抽象工厂：具体工厂。具体工厂生产具体产品
 */


/**
 * 日志记录器接口：抽象产品
 */
interface Logger {
    /**
     * 写入日志信息
     */
    public void writeLog();
}



/**
 * 数据库日志记录器：具体产品
 */
class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }

}

/**
 * 文件日志记录器：具体产品
 */
class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}

/**
 * 日志记录器工厂接口：抽象工厂
 */
interface LoggerFactory {
    /**
     * 使用工厂创建具体工厂方法
     * @return
     */
    public Logger createLogger();
}

/**
 * 数据库日志记录器工厂类：具体工厂
 */
class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}



