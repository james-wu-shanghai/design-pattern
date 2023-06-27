package com.shanghai.james.dp.behaviro.command;

public class Client {
    public static void main(String[] args) {
        final Command command = new ConcreteCommand();
        command.execute();
        command.execute(); // This time will not success
    }
}
