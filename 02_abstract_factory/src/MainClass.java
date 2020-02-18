public class MainClass {

    public static void main(String[] args) throws Exception{

        AbstractFactory abstractFactory1 = new AppleFactory();
        abstractFactory1.getApple("AppleNorth").getFruit();
        AbstractFactory abstractFactory2 = new AppleFactory();
        abstractFactory2.getApple("AppleSouth").getFruit();
        AbstractFactory abstractFactory3 = new BananaFactory();
        abstractFactory3.getBanana("BananaNorth").getFruit();
        AbstractFactory abstractFactory4 = new BananaFactory();
        abstractFactory4.getBanana("BananaSouth").getFruit();

    }

}
