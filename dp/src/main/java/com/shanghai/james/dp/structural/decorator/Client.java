package com.shanghai.james.dp.structural.decorator;

public class Client {
    public static void main(String[] args) {
        ConcreateComponent concreateComponent = new ConcreateComponent();
        concreateComponent.addDecorator(new ConcreteDecoratorA());
        concreateComponent.addDecorator(new ConcreteDecoratorB());
        concreateComponent.operation();
    }
}
