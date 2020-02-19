public class Apple3 {
    /**双重校验模式, 不能用final*/
    private static Apple3 APPLE_3 = null;

    public static Apple3 getApple3() {
        if (APPLE_3 == null) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("ingore");
            }
//            这个锁不要加在函数上，否则每次调用的时候，都会浪费资源
            synchronized (Apple3.class) {
                APPLE_3 = new Apple3();
                return APPLE_3;
            }
        }
        return APPLE_3;
    }

}

