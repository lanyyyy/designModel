package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerProxy implements InvocationHandler {
    private Fruit fruit;

    public InvocationHandlerProxy(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("1.调用代理方法");
        if ("sayName".equalsIgnoreCase(method.getName())) {
            System.out.println("sayName method");
            method.invoke(fruit, args);
        } else if ("sayEngName".equalsIgnoreCase(method.getName())) {
            System.out.println("sayEngName method");
            method.invoke(fruit, args);
        }

        System.out.println("2.不区分方法，直接调用");
        method.invoke(fruit, args);
        return null;
    }
}
