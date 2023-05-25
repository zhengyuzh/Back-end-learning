package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/22 19:12
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = new ProxySearcher();
        String result = searcher.DoSearch("张三","天龙八部");
        System.out.println(result);


    }
}
