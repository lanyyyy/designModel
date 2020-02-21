package common;


public class MainClass {

    public static void main(String[] args){

        Subject subject = new Subject();
        subject.addMyObserves(new MyObserveImpl());
        subject.addMyObserves(new MyObserveImpl());
        subject.setVar("haha");
    }


}
