package com.shanghai.james.dp.creational.abstractfactory.factory;

import com.shanghai.james.dp.creational.abstractfactory.product.AbstractProductA;
import com.shanghai.james.dp.creational.abstractfactory.product.AbstractProductB;

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
