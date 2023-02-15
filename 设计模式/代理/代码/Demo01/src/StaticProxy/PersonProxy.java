package StaticProxy;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 13:35
 * @Description:
 */
public class PersonProxy implements Person{
    private Person person;

    public PersonProxy(Person person){
        this.person = person;
    }
    @Override
    public void wakeup() {
        System.out.println("早上好啊!!!");
        person.wakeup();
    }

    @Override
    public void sleep() {
        System.out.println("晚上好啊!!!");
        person.sleep();
    }
}
