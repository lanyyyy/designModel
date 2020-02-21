package javaver;

import java.util.Observable;

public class Subject extends Observable {

    private String var;

    public void setVar(String var) {
        this.var = var;
        super.setChanged();
        super.notifyObservers();
    }


}
