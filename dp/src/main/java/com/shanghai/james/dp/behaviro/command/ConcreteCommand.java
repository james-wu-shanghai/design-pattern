package com.shanghai.james.dp.behaviro.command;

public class ConcreteCommand implements Command {
    private Receiver receiver;
    private STATE state;

    private enum STATE {
        INIT,
        DONE
    }

    public ConcreteCommand() {
        receiver = new Receiver();
        state = STATE.INIT;
    }

    @Override
    public void execute() {
        if (state == STATE.DONE) {
            System.out.println("Command has been executed, no need to execute again");
            return;
        }
        receiver.action();
        state = STATE.DONE;
        System.out.println("Command execute");
    }
}
