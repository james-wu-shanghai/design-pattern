package com.shanghai.james.dp.creational.builder;

public class Director {
    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object build(Object input) {
        if (input instanceof String) {
            return builder.buildPartA();
        } else if (input instanceof Integer) {
            return builder.buildPartB();
        } else {
            return builder.buildPartC();
        }
    }

}
