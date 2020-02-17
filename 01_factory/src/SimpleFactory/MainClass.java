package SimpleFactory;

public class MainClass {

    public static void main(String[] args) throws Exception{
        // 方式1：判断名称
//        Fruit fruit1 = FruitFactory.getFruit("Apple");
//        fruit1.getFruit();
//        Fruit fruit2 = FruitFactory.getFruit("Banana");
//        fruit2.getFruit();

        // 方式2：使用类名称
        Fruit fruit1 = FruitFactory.getFruit("SimpleFactory.Apple");
        fruit1.getFruit();
        Fruit fruit2 = FruitFactory.getFruit("SimpleFactory.Banana");
        fruit2.getFruit();
    }

}
