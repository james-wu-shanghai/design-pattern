package com.shanghai.james.dp.behaviro.state;

public class Middle extends AbstractState {

    @Override
    public State end() {
        System.out.println("middle to end");
        return new End();
    }
}
