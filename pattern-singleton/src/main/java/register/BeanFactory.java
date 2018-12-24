package register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by www on 2018/12/24.
 * Spring中的做法，就是用这种注册式单例
 */
public class BeanFactory {

    private BeanFactory(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {

        if (!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        } else {
            return ioc.get(className);
        }

    }
}
