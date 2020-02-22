package dynamic;

import java.lang.reflect.Proxy;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("这是JDK的动态代理模式");

        InvocationHandlerProxy proxy = new InvocationHandlerProxy(new Apple());
        Fruit fruit = (Fruit) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Fruit.class}, proxy);
        fruit.sayName();
        fruit.sayEngName();
    }

}
