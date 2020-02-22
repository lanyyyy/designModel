
public class Product {

    private String cpu;
    private String screen;
    private String keyboard;

    public Product() {}

    public Product(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        keyboard = builder.keyboard;
    }

    public Product(String cpu, String screen, String keyboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void printStr() {
        System.out.println("cpu=" + this.cpu + ",screen=" + this.screen + ",keyboard=" + this.keyboard);
    }

//    声明一个内部的构造Builder
    public static class Builder{
        private String cpu;
        private String screen;
        private String keyboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
//        方便链式调用
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}


