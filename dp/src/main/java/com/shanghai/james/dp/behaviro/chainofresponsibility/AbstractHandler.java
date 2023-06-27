package com.shanghai.james.dp.behaviro.chainofresponsibility;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public void execute() {
        handleProcess();
        if (nextHandler != null) {
            nextHandler.execute();
        }
    }

    protected abstract void handleProcess();

    public void setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
    }
}
