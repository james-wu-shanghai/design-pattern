package com.shanghai.james.dp.behaviro.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();
        handler1.setNextHandler(handler2);

        handler1.execute();
    }
}
