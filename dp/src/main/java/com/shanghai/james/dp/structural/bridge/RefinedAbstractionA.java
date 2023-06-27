package com.shanghai.james.dp.structural.bridge;

public class RefinedAbstractionA extends Abstraction {
    public RefinedAbstractionA() {
        implementation = new ConcreteImplA();
    }

    public void Operation() {
        doMyStuffA();
        implementation.OperationImpl();
    }

    private void doMyStuffA() {
        System.out.println("do my stuff A");
    }
}
