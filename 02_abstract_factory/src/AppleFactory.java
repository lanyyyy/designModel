public class AppleFactory extends AbstractFactory {

    @Override
    public Fruit getApple(String place) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class apple = Class.forName(place);
        return (Fruit) apple.newInstance();
    }

    @Override
    public Fruit getBanana(String place) {
        return null;
    }

}
