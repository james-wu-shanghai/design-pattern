package com.shanghai.james.dp.structural.flyweight;

public class ConcreteFlyweightB extends Flyweight {
    @Override
    public String operation(String extrinsicState) {
        System.out.println("ConcreteFlyweightB operation: " + extrinsicState);
        return extrinsicState;
    }
}
