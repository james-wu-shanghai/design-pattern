package com.shanghai.james.dp.behaviro.chainofresponsibility;

public class ConcreteHandler2 extends AbstractHandler {
    @Override
    protected void handleProcess() {
        System.out.println("ConcreteHandler2 handleProcess");
    }
}
