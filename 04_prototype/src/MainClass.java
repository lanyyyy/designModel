import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) throws Exception{
//        错误示范：
        AppleCommon appleCommon1 = new AppleCommon();
        AppleCommon appleCommon2 = appleCommon1;
        System.out.println("直接赋值，实例地址不变：" + appleCommon1 + " " + appleCommon2);

//        传统的复制
        AppleCommon appleCommon3 = new AppleCommon();
        appleCommon3.setColor("green");
        AppleCommon appleCommon4 = new AppleCommon();
        appleCommon4.setColor(appleCommon3.getColor());
        System.out.println("传统复制，实例地址改变：" + appleCommon3 + " " + appleCommon4);
        System.out.println("传统复制，变量每次需手动修改：" + appleCommon3.getColor() + " " + appleCommon4.getColor());

//        原型模式：继承Clonable的复制
        AppleProtoType appleProtoType1 = new AppleProtoType();
        appleProtoType1.setColor("green");
        AppleProtoType appleProtoType2 = appleProtoType1.clone();
        System.out.println("原型模式，实例地址改变：" + appleProtoType1 + " " + appleProtoType2);
        System.out.println("原型模式，变量clone即生效：" + appleProtoType1.getColor() + " " + appleProtoType2.getColor());

//        原型模式-浅拷贝：继承Clonable的复制
        AppleProtoTypeLowCopy appleProtoTypeLowCopy1 = new AppleProtoTypeLowCopy();
        appleProtoTypeLowCopy1.setColor("green");
        List<Map<String, String>> sizes = new ArrayList<>();
        Map<String, String> size = new HashMap<>();
        size.put("apple", "5");
        sizes.add(size);
        appleProtoTypeLowCopy1.setSizes(sizes);
        AppleProtoTypeLowCopy appleProtoTypeLowCopy2 = appleProtoTypeLowCopy1.clone();
        System.out.println("原型模式，实例地址改变：" + appleProtoTypeLowCopy1 + " " + appleProtoTypeLowCopy2);
        System.out.println("原型模式，变量color clone即生效：" + appleProtoTypeLowCopy1.getColor() + " " + appleProtoTypeLowCopy2.getColor());
        System.out.println("原型模式，变量sizes clone未生效：" + appleProtoTypeLowCopy1.getSizes() + " " + appleProtoTypeLowCopy2.getSizes());



    }


}
