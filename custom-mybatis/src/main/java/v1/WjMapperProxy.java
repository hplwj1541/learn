package v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WjMapperProxy implements InvocationHandler {

    private WjSqlSession wjSqlSession;

    public WjMapperProxy(WjSqlSession wjSqlSession) {
        this.wjSqlSession = wjSqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(WjConfiguration.TestMapperXml.namespace)) {
            String sql = WjConfiguration.TestMapperXml.methodSqlMapping.get(method.getName());
            return wjSqlSession.selectOne(sql, String.valueOf(args[0]));
        }
        return method.invoke(this, args);
    }
}
