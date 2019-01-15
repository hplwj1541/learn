package v1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class WjConfiguration {

    public <T> T getMapper(Class<T> clazz, WjSqlSession wjSqlSession) {
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new WjMapperProxy(wjSqlSession));
    }

    static class TestMapperXml {
        public static final String namespace = "dao.TestMapper";

        public static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

        static {
            methodSqlMapping.put("selectById", "select * from test where id = %d");
        }
    }
}
