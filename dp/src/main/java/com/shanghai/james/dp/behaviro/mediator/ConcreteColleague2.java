package com.shanghai.james.dp.behaviro.mediator;

public class ConcreteColleague2 implements Colleague {
    private Mediator mediator;
    private boolean tend2fail = false;


    public ConcreteColleague2() {

    }

    public ConcreteColleague2(boolean tend2fail) {
        this.tend2fail = tend2fail;

    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void work() {
        System.out.println("ConcreteColleague2 work");
        mediator.finish(this, !tend2fail);
    }

    @Override
    public void rollback() {
        System.out.println("ConcreteColleague2 rollback");
    }
}
