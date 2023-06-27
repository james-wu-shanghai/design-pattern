package com.shanghai.james.dp.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    List<Decorator> decorators = new ArrayList<Decorator>();

    public void addDecorator(Decorator decorator) {
        decorators.add(decorator);
    }

    void operation() {
        for (Decorator decorator : decorators) {
            decorator.Operation();
        }
    }
}
