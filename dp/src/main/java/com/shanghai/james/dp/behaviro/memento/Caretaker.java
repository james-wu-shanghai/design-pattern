package com.shanghai.james.dp.behaviro.memento;


import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();


    private final Orginator originator;

    public Caretaker() {
        this.originator = new Orginator();
    }


    public void addMemento(Memento memento) {
        this.mementoStack.add(memento);
    }

    public Memento popMemento() {
        return mementoStack.pop();
    }


}
