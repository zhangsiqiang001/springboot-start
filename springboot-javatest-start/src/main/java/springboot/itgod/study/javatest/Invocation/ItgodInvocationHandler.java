package springboot.itgod.study.javatest.Invocation;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ItgodInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("conn db");
        Select annotation = method.getAnnotation(Select.class);
        String[] value = annotation.value();
        System.out.println(value[0]);
        return null;
    }
}
