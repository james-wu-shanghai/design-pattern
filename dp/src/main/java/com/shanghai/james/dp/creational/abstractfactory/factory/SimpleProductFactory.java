package com.shanghai.james.dp.creational.abstractfactory.factory;

import com.shanghai.james.dp.creational.abstractfactory.product.AbstractProductA;
import com.shanghai.james.dp.creational.abstractfactory.product.AbstractProductB;
import com.shanghai.james.dp.creational.abstractfactory.product.ProductASimple;
import com.shanghai.james.dp.creational.abstractfactory.product.ProductBSimple;

public class SimpleProductFactory extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductASimple();
    }

    public AbstractProductB createProductB() {
        return new ProductBSimple();
    }
}
