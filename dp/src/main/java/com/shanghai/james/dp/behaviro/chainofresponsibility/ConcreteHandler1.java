package com.shanghai.james.dp.behaviro.chainofresponsibility;

public class ConcreteHandler1 extends AbstractHandler{
    @Override
    protected void handleProcess() {
        System.out.println("ConcreteHandler1 handleProcess");
    }
}
