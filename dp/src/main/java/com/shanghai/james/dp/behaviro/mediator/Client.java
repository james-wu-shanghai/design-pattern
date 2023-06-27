package com.shanghai.james.dp.behaviro.mediator;

public class Client {
    public static void main(String[] args) {
        final Mediator mediator = new ConcreteMediator();
        mediator.createMediator(new ConcreteColleague1(), new ConcreteColleague2());
        mediator.workAll();

        mediator.createMediator(new ConcreteColleague1(), new ConcreteColleague2(true));
        mediator.workAll();

    }
}
