package com.shanghai.james.dp.structural.flyweight;

public class ConcreteFlyweightA extends Flyweight {
    @Override
    public String operation(String extrinsicState) {
        System.out.println("ConcreteFlyweightA operation: " + extrinsicState);
        return extrinsicState;
    }
}
