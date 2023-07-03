package com.shanghai.james.dp.behaviro.memento;

public class Client {
    public static void main(String[] args) {
        Orginator orginator = new Orginator();
        orginator.setState("start");

        final Caretaker caretaker = new Caretaker();
        caretaker.addMemento(orginator.createMemento());
        System.out.printf("State: %s%n", caretaker.popMemento().getState());


        orginator.setState("end");
        caretaker.addMemento(orginator.createMemento());
        System.out.printf("State: %s%n", caretaker.popMemento().getState());
    }
}
