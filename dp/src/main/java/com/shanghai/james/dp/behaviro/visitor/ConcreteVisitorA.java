package com.shanghai.james.dp.behaviro.visitor;

public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitorA visit ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitorA visit ConcreteElementB");
    }
}
