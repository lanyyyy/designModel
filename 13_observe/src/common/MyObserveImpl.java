package common;

public class MyObserveImpl implements MyObserve {
    @Override
    public void notice() {
        System.out.println("I got the notice");
    }
}
