import java.util.List;
import java.util.Map;

public class AppleProtoTypeLowCopy implements Cloneable {

    /** clone对象 */
    private String color;

    private List<Map<String, String>> sizes;

    @Override
    public AppleProtoTypeLowCopy clone() {
        try {
            return (AppleProtoTypeLowCopy) super.clone();
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

    public List<Map<String, String>> getSizes() {
        return sizes;
    }

    public void setSizes(List<Map<String, String>> sizes) {
        this.sizes = sizes;
    }
}
