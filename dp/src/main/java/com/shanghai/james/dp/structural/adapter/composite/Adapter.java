package com.shanghai.james.dp.structural.adapter.composite;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    public void request() {
        adaptee.specifiedRequest();
    }
}
