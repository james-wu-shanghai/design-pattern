package com.shanghai.james.dp.behaviro.mediator;

public interface Colleague {

    void setMediator(Mediator mediator);

    void work();

    void rollback();
}
