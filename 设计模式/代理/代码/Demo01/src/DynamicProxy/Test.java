package DynamicProxy;

import StaticProxy.Person;
import StaticProxy.Student;

import java.lang.reflect.Proxy;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 13:46
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy(new Student("李四"));
        Person student = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        student.wakeup();
        student.sleep();
    }
}
