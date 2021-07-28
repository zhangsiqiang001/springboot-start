package springboot.itgod.study.javatest.Invocation;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.Proxy;

public class ItgodFactory {


    public static Object getMapper(Class clazz) {
        Class[] classes = new Class[]{clazz};
        Object o = Proxy.newProxyInstance(ItgodFactory.class.getClassLoader(), classes, new ItgodInvocationHandler());
        return o;
    }
}
