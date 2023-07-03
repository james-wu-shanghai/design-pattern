package com.shanghai.james.dp.behaviro.mediator;

public class ConcreteColleague1 implements Colleague {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void work() {
        System.out.println("ConcreteColleague1 work");
        mediator.finish(this, true);
    }

    @Override
    public void rollback() {
        System.out.println("ConcreteColleague1 rollback");
    }
}
