package main.java;

import java.util.ArrayList;
import java.util.List;

public class Component {

    private String name;
    public Component(String name) {
        this.name = name;
    }

    List<Component> componentList = new ArrayList<>();
    public void add (Component c) {componentList.add(c);}
    public void remove (Component c) {componentList.remove(c);}
    public void print() {
        System.out.println(toString());
        componentList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Component ceo = new Component("ceo");
        ceo.add(new Component("cfo"));
        ceo.add(new Component("cto"));
        ceo.print();
    }
}
