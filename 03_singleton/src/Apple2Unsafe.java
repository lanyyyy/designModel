public class Apple2Unsafe {
    /**懒汉模式, 不能用final*/
    private static Apple2Unsafe APPLE_2_UNSAFE = null;

    public static Apple2Unsafe getUnsafeApple2() {
        if (APPLE_2_UNSAFE == null) {
//            System.out.println("start");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("ingore");
            }
            APPLE_2_UNSAFE = new Apple2Unsafe();
//            System.out.println("end");

            return APPLE_2_UNSAFE;
        }
        return APPLE_2_UNSAFE;
    }
}

