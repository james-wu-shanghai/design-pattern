package com.shanghai.james.dp.behaviro.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println(visitor.getClass().getSimpleName() + " accept in ConcreteElementA");
        visitor.visit(this);
    }
}
