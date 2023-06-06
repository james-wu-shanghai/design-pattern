package com.shanghai.james.dp.creational.builder;

public class Client {
    public Object[] doBuild() {
        final Director director = new Director(new Builder());
        Object[] parts = new Object[3];

        Object[] inputs = {"a", 1, 3.5};
        for (int i = 0; i < inputs.length; i++) {
            parts[i] = director.build(inputs[i]);
        }
        return parts;
    }
}
