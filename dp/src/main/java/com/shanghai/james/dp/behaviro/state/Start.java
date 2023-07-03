package com.shanghai.james.dp.behaviro.state;

public class Start extends AbstractState{

    @Override
    public State start() {
        System.out.println("start to middle");
        return new Middle();
    }
}
