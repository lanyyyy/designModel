package SimpleFactory;

public class FruitFactory {

    public static Fruit getFruit(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        // 方式1：直接匹配
//        if ("apple".equalsIgnoreCase(type)) {
//            return new Apple();
//        } else if ("banana".equalsIgnoreCase(type)) {
//            return new Banana();
//        } else {
//            System.out.println("未找到水果");
//            return null;
//        }
        // 方式2：使用类名称
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }

}
