package com.shanghai.james.dp.behaviro.memento;

public class Orginator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }


}
