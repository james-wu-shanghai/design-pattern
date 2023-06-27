package com.shanghai.james.dp.structural.composite;

public class Client {
    public static void main(String[] args) {
        Component component = new Composite();
        component.add(new Leaf("L01"));
        component.add(new Leaf("L02"));
        component.add(new Leaf("L03"));

        Composite compositeL1 = new Composite();
        compositeL1.add(new Leaf("L11"));
        Composite compositeL2 = new Composite();
        compositeL2.add(new Leaf("L21"));
        compositeL1.add(compositeL2);

        component.add(compositeL1);

        component.operation();
    }
}
