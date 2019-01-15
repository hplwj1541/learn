package jdk;

import staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by www on 2018/12/24.
 */
public class JDK58 implements InvocationHandler{

    private Person target;

    public Object getInstance(Person target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是58：我要给你找工作，现在已经拿到你的简历");
        System.out.println("开始投递");

        method.invoke(this.target, args);

        System.out.println("安排面试");

        return null;
    }
}
