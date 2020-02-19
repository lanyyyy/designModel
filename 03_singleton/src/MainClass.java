public class MainClass {

    public static void main(String[] args) throws Exception{
//        传统的new方式，生成的对象地址不一样
        AppleNew appleNew1 = new AppleNew();
        AppleNew appleNew2 = new AppleNew();
        System.out.println("传统:" + appleNew1 + " " + appleNew2);

//        饿汉，可能存在资源浪费，因为只要引入就会初始化
        Apple1 apple11 = Apple1.getApple1();
        Apple1 apple12 = Apple1.getApple1();
        System.out.println("饿汉:" + apple11 + " " + apple12);

//        懒汉，线程不安全
        Apple2 apple21 = Apple2.getApple2();
        Apple2 apple22 = Apple2.getApple2();
        System.out.println("懒汉:" + apple21 + " " + apple22);

//        懒汉，模拟线程不安全测试
        new Thread(new RunnableTest()).start();
        new Thread(new RunnableTest()).start();
        Thread.sleep(1000);

//        双重校验，可以看到生成对象的地址不会变化
        Apple3 apple31 = Apple3.getApple3();
        Apple3 apple32 = Apple3.getApple3();
        System.out.println("双重校验:" + apple31 + " " + apple32);


    }

    public static class RunnableTest implements Runnable {
        @Override
        public void run() {
            Apple2Unsafe apple2Unsafe = Apple2Unsafe.getUnsafeApple2();
            System.out.println("懒汉，线程不安全:" + apple2Unsafe);
        }
    }


}
