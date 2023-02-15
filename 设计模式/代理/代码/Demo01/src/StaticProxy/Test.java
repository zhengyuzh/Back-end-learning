package StaticProxy;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 13:37
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person student1 = new Student("张三");
        PersonProxy studentProxy = new PersonProxy(student1);
        studentProxy.wakeup();
        studentProxy.sleep();
    }
}
