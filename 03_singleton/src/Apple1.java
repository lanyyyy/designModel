public class Apple1 {
    /**饿汉模式*/
    private final static Apple1 APPLE_1 = new Apple1();

    public static Apple1 getApple1() {
        return APPLE_1;
    }
}
