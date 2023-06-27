package com.shanghai.james.dp.behaviro.templatemethod;

public abstract class AbstractTemplate {

    public void templateMethod() {
        System.out.println("AbstractTemplate.templateMethod");
        primitiveOperation1();
        primitiveOperation2();
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
