package StaticProxy;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 13:32
 * @Description:
 */
public class Student implements Person{
    private String name;

    public Student(){
    }

    public Student(String name){
        this.name = name;
    }


    @Override
    public void wakeup() {
        System.out.println("学生："+name+"，起床了！！！");
    }

    @Override
    public void sleep() {
        System.out.println("学生："+name+"，睡觉了！！！");
    }
}
