package common;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String var;

    private List<MyObserve> myObserves;

    public void setVar(String var) {
        this.var = var;
        this.noticeAll();
    }

    private void noticeAll() {
        for(MyObserve myObserve: this.myObserves) {
            myObserve.notice();
        }
    }

    public void addMyObserves(MyObserve myObserve) {
        if (this.myObserves == null) {
            this.myObserves = new ArrayList<>();
        }
        this.myObserves.add(myObserve);
    }
}
