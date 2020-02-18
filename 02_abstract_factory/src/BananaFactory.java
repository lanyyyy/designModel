public class BananaFactory extends AbstractFactory {

    @Override
    public Fruit getApple(String place) {
        return null;
    }

    @Override
    public Fruit getBanana(String place) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class banana = Class.forName(place);
        return (Fruit) banana.newInstance();
    }
}