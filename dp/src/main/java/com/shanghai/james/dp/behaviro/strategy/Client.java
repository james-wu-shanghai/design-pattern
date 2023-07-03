package com.shanghai.james.dp.behaviro.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.algorithm("A");
        context.algorithm("B");
        context.algorithm("C");
    }
}
