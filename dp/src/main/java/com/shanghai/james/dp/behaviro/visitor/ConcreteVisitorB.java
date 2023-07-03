package com.shanghai.james.dp.behaviro.visitor;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitorB visit ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitorB visit ConcreteElementB");
    }
}
