package com.shanghai.james.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    protected List<Component> children = new ArrayList<Component>();

    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }

    public void add(Component component) {
        this.children.add(component);
    }

    public void remove(Component component) {
        this.children.remove(component);
    }

    public Component getChild(int i) {
        return children.get(i);
    }
}
