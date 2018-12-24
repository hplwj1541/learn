package staticed;

/**
 * Created by www on 2018/12/24.
 * 静态代理
 * 需传入具体的被代理类，不能扩展
 */
public class JobProxy implements Person{

    private Person person;

    public JobProxy(Person person){
        this.person = person;
    }

    @Override
    public void findJob() {
        System.out.println("代理给你找工作");
        person.findJob();
    }
}
