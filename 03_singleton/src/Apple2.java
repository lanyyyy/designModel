public class Apple2 {
    /**懒汉模式, 不能用final*/
    private static Apple2 APPLE_2 = null;

    public static Apple2 getApple2() {
        if (APPLE_2 == null) {
            APPLE_2 = new Apple2();
            return APPLE_2;
        }
        return APPLE_2;
    }

}
