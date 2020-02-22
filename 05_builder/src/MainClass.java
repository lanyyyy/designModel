public class MainClass {

    public static void main(String[] args){
//        传统的声明
        Product product = new Product("Intel", "Sony Screen", "jijia");
        product.printStr();

//        Builder声明模式：Java里的@lombok注解就是类似的实现方式：
//        建造者模式：构建过程和表示相分离，可以生成复杂的构建对象
        Product product1 = new Product.Builder()
                .cpu("AMD")
                .screen("ACER")
                .keyboard("xx")
                .cpu("zhong xin")
                .build();
        product1.printStr();

//        设计模式类的：比较复杂，暂不实现

    }

}
