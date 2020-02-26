public class FruitPear extends Fruit{
    @Override
    public void sayAttrs() {
        super.getColor().sayColor();
        sayFruit();
    }

    @Override
    public void sayFruit() {
        System.out.println("I am Pear");
    }
}
