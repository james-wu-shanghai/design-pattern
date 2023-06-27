package com.shanghai.james.dp.behaviro.mediator;

public interface Mediator {

    void workAll();

    void createMediator(Colleague... colleagues);

    void finish(Colleague colleague, Boolean status);
}
