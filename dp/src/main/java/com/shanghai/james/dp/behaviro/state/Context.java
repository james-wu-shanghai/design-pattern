package com.shanghai.james.dp.behaviro.state;

public class Context {
    private State state;

    public Context() {
        state = new Start();
    }

    public State start() {
        this.state = state.start();
        return state;
    }

    public State end() {
        this.state = state.end();
        return state;
    }
}
