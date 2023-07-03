package com.shanghai.james.dp.behaviro.state;

public abstract class AbstractState implements State {


    @Override
    public State start() {
        throw new IllegalStateException("start method not support in the class " + getClass().getName());
    }


    @Override
    public State end() {
        throw new IllegalStateException("end method not support in the class " + getClass().getName());
    }
}
