public class MainClass {

    public static void main(String[] args){
        Color color = new ColorRed();
        Fruit fruit = new FruitApple();
        fruit.setColor(color);
        fruit.sayAttrs();

//        其他示例：如不同操作系统，实现不同的媒体文件播放
//        桥接模式，提高了系统的可扩展性，不过需要识别到系统之间的正确的关联关系
    }

}
