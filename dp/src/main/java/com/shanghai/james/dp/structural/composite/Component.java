package com.shanghai.james.dp.structural.composite;

public interface Component {


    public void operation();

    public void add(Component component);

    public void remove(Component component);

    public Component getChild(int i);
}
