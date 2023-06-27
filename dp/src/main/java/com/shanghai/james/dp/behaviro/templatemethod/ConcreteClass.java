package com.shanghai.james.dp.behaviro.templatemethod;

public class ConcreteClass extends AbstractTemplate {

    @Override
    protected void primitiveOperation1() {
        System.out.println("PrimitiveOperation1.primitiveOperation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("PrimitiveOperation1.primitiveOperation2");
    }

}
