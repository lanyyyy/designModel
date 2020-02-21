public class AppleProtoType implements Cloneable {

    /** clone对象 */
    private String color;

    @Override
    public AppleProtoType clone() {
        try {
            return (AppleProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
