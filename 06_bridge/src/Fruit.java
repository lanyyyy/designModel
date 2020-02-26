public abstract class Fruit {

    private Color color;

    public abstract void sayAttrs();

    public abstract void sayFruit();

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
