package com.shanghai.james.dp.structural.bridge;

public class RefinedAbstractionB extends Abstraction {
    public RefinedAbstractionB() {
        implementation = new ConcreteImplB();
    }

    public void Operation() {
        doMyStuffB();
        implementation.OperationImpl();
    }

    private void doMyStuffB() {
        System.out.println("do my stuff B");
    }

}
