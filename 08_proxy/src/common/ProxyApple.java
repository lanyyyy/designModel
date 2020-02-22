package common;

public class ProxyApple {
    private Fruit fruit;

    public ProxyApple(Fruit fruit) {
        this.fruit = fruit;
    }

    public void sayName() {
        this.fruit.sayName();
    }

    public void sayEngName() {
        this.fruit.sayEngName();
    }

}
