package com.shanghai.james.dp.behaviro.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void broadcast() {
        for (Observer observer : observerList) {
            try {
                observer.update();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
