package com.shanghai.james.dp.behaviro.observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void broadcast();
}
