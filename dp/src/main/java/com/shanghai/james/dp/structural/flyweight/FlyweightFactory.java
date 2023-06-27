package com.shanghai.james.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        if (key.equals("A")) {
            flyweights.computeIfAbsent("A", k -> new ConcreteFlyweightA());
        } else if (key.equals("B")) {
            flyweights.computeIfAbsent("B", k -> new ConcreteFlyweightA());
        } else {
            throw new IllegalArgumentException("Illegal argument");
        }
        return flyweights.get(key);
    }

}
