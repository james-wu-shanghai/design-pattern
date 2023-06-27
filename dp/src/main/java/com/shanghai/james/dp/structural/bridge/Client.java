package com.shanghai.james.dp.structural.bridge;

public class Client {
    public static void main(String[] args) {
        new RefinedAbstractionA().Operation();

        new RefinedAbstractionB().Operation();
    }
}
