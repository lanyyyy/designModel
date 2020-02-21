package javaver;

import java.util.Observable;
import java.util.Observer;

public class ObserveIpml implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("I got the notice");
    }
}
