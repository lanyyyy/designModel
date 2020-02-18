public abstract class AbstractFactory {
    public abstract Fruit getApple(String place) throws IllegalAccessException, InstantiationException, ClassNotFoundException;

    public abstract Fruit getBanana(String place) throws IllegalAccessException, InstantiationException, ClassNotFoundException;
}
