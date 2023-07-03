package com.shanghai.james.dp.behaviro.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver1());
        subject.attach(new ConcreteObserver2());
        subject.broadcast();
    }
}
