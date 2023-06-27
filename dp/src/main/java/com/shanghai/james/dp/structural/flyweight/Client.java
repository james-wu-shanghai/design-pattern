package com.shanghai.james.dp.structural.flyweight;

public class Client {


    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        final String a = factory.getFlyweight("A").operation("A");
        final String b = factory.getFlyweight("B").operation("B");
    }
}
