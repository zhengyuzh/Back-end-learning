package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/28 21:53
 * @Description:
 */
public class Client {
    public static void main(String args[]) {
        Account acc = new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}
