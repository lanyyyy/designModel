package common;

public class MainClass {

    public static void main(String[] args){

        System.out.println("这是普通的代理模式");

        ProxyApple proxyApple = new ProxyApple(new Apple());
        proxyApple.sayName();
        proxyApple.sayEngName();
    }

}
