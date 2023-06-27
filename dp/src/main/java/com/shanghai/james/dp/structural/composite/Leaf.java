package com.shanghai.james.dp.structural.composite;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("Leaf operation " + name);
    }

    @Override
    public void add(Component component) {
        System.out.println("warning, leaf can't add component");

    }

    @Override
    public void remove(Component component) {
        System.out.println("warning, leaf can't remove component");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("warning, leaf can't get child components");
        return null;
    }
}
