import one.TemplateOne;
import one.TemplateOneImpl;
import two.TestObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        new TemplateOneImpl().execute();
        List<TestObject> testObjectList = new ArrayList<TestObject>();
        Collections.sort(testObjectList, new Comparator<TestObject>() {
            public int compare(TestObject o1, TestObject o2) {
                return 0;
            }
        });
    }
}
