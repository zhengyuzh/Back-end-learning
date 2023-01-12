# 1、Spring5框架概述、入门案例

## 1.1 Spring5框架概述

1、Spring 是**轻量级**的开源的 JavaEE 框架

2、Spring 可以解决企业应用开发的复杂性

3、Spring 有两个核心部分：**IOC**和**Aop**

- （1）IOC：控制反转，把创建对象过程交给 Spring 进行管理
- （2）Aop：面向切面，不修改源代码进行功能增强

4、Spring 特点

- （1）方便解耦，简化开发
- （2）Aop 编程支持
- （3）方便程序测试
- （4）方便和其他框架进行整合
- （5）方便进行事务操作
- （6）降低 API 开发难度

## 1.2 入门案例

请看项目代码：`SpringDemo-1`。
        位置：**后端学习\框架学习\Spring框架\代码\SpringDemo-1**

有详细的创建过程，包含图解



### 1.2.1 创建一个普通类

```
package com.zyz.spring;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/1/12 19:00
 * @Description:
 */
public class Person {
    public void say(){
        System.out.println("我是一个普通类");
    }
}

```

### 1.2.2 创建xml文件

Spring 配置文件使用 xml 格式

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!-- 配置Person对象创建-->
    <bean id="person" class="com.zyz.spring.Person"></bean>
</beans>

```

### 1.2.3 测试

这里读取配置文件，获取到里边的对象。通过对象调用对应的方法

```
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
```



# 2、IOC容器底层原理