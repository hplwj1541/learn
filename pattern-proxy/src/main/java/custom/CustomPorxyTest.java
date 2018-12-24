package custom;

import staticed.Person;
import staticed.Student;

/**
 * Created by Tom on 2018/3/10.
 */
public class CustomPorxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new Student());
            System.out.println(obj.getClass());
            obj.findJob();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
