package com.zyz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/11 11:49
 * @Description: 负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，
 *                                     考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
 */
class LoadBalancer {

    private static LoadBalancer instance = null;  //私有静态成员变量，存储唯一实例
    private List serverList = null; //服务器集合

    /**
     * 私有构造函数
     */
    private LoadBalancer() {
        serverList = new ArrayList();
    }

    /**
     * 共有静态成员方法，返回唯一实例
     * @return
     */
    public static LoadBalancer getLoadBalancer(){
        if(instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    /**
     * 增加服务器
     * @param server
     */
    public void addServer(String server) {
        serverList.add(server);
    }

    /**
     * 删除服务器
     * @param server
     */
    public void removeServer(String server) {
        serverList.remove(server);
    }

    /**
     * 使用Random类随机获取服务器
     * @return
     */
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }


}
