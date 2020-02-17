package Factory;

public class MainClass {

    public static void main(String[] args) throws Exception{
        Fruit fruit1 = new AppleFactory().getFruit();
        fruit1.getFruit();
        Fruit fruit2 = new BananaFactory().getFruit();
        fruit2.getFruit();
    }

}
