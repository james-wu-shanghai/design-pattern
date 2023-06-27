package com.shanghai.james.dp.structural.adapter.inherate;

public class Adapter extends Adaptee implements Target {

    public void request() {
        super.specifiedRequest();
    }
}
