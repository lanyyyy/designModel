package javaver;

public class MainClass {

    public static void main(String[] args){

        Subject subject = new Subject();
        subject.addObserver(new ObserveIpml());
        subject.setVar("haha");

    }


}
