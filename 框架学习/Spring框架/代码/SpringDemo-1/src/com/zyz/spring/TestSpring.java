package com.zyz.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/1/12 19:02
 * @Description:
 */
public class TestSpring {
    @Test
    public void test(){
        //1、加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.say();

    }

}
