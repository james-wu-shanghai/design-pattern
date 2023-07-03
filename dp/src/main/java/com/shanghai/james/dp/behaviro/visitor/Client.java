package com.shanghai.james.dp.behaviro.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitorA();
        objectStructure.accept(visitor);

        visitor = new ConcreteVisitorB();
        objectStructure.accept(visitor);
    }
}
