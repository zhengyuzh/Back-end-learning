package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/22 18:55
 * @Description:
 */

//身份验证类，业务类，它提供方法Validate()来实现身份验证。

class AccessValidator {

    public Boolean Validate(String userId){
        if(userId.equals("张三")){
            System.out.println(userId+",通过校验,登录成功");
            return true;
        }else{
            System.out.println(userId+",未通过校验,登录失败！！！");
            return false;
        }

    }

}


//日志记录类，业务类，它提供方法Log()来保存日志。

class Logger{
    public void Log(String userId){
        System.out.println("更新数据库，用户" + userId + "查询次数加1");
    }

}


//抽象查询类，充当抽象主题角色，它声明了DoSearch()方法

interface Searcher{
    public String DoSearch(String userId, String keyword);
}


//具体查询类，充当真实主题角色，它实现查询功能，提供方法DoSearch()来查询信息。

class RealSearcher implements Searcher{

    /**
     * 模拟查询商务信息
     * @param userId
     * @param keyword
     * @return
     */
    @Override
    public String DoSearch(String userId, String keyword) {
        System.out.println("用户:"+ userId+",使用关键词:" + keyword + "查询商务信息！");
        return "我查询了数据";
    }
}

//代理查询类，充当代理主题角色，它是查询代理，维持了对RealSearcher对象、AccessValidator对象和Logger对象的引用。

class ProxySearcher implements Searcher{

    private RealSearcher searcher = new RealSearcher(); //维持一个对真实主题的引用
    private AccessValidator validator;
    private Logger logger;


    @Override
    public String DoSearch(String userId, String keyword) {
        if(this.Validate(userId)){
            String result = searcher.DoSearch(userId,keyword);//调用真实主题对象的查询方法
            this.Log(userId);//记录日志
            return result; //返回查询结果

        }
        return null;

    }


    /**
     * 创建访问验证对象并调用其Validate()方法实现身份验证
     * @param userId
     * @return
     */
    public Boolean Validate(String userId)
    {
        validator = new AccessValidator();
        return validator.Validate(userId);
    }

    /**
     * 创建日志记录对象并调用其Log()方法实现日志记录
     * @param userId
     */
    public void Log(String userId)
    {
        logger = new Logger();
        logger.Log(userId);
    }
}