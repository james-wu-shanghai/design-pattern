package com.shanghai.james.dp.behaviro.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println(visitor.getClass().getSimpleName() + " accept in ConcreteElementB");
        visitor.visit(this);
    }
}
