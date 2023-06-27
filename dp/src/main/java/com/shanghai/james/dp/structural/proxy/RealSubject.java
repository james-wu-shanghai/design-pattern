package com.shanghai.james.dp.structural.proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        //ACL, IO,...
        System.out.println("RealSubject");
    }
}
