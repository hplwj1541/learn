package simple;

import java.util.ArrayList;

/**
 *
 */
public class CloneTest {

    public static void main(String[] args) {

        CloneTarget p = new CloneTarget();
        p.name = "Tom";
//        p.list = new ArrayList<CloneTarget>();
//        p.list.add(new CloneTarget());
        p.target = new CloneTarget();
        System.out.println(p.target);

        try {
            CloneTarget obj =  (CloneTarget) p.clone();
            System.out.println(obj.target);

            p.name = "Test";
            p.target.name = "Test";

            System.out.println(obj.target.name);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
