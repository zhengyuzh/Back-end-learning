package com.zyz.com;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/15 22:45
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.FileEncrypt();
    }
}
