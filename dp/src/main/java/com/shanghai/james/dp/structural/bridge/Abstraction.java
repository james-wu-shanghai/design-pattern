package com.shanghai.james.dp.structural.bridge;

public class Abstraction {

    protected Implementation implementation;


    public void Operation() {
        implementation.OperationImpl();
    }
}
