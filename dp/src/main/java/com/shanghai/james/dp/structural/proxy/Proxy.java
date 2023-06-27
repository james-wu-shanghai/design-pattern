package com.shanghai.james.dp.structural.proxy;

public class Proxy implements Subject {

    private final Subject subject = new RealSubject();


    public void request() {
        System.out.println("Proxy");
        subject.request();
    }
}
