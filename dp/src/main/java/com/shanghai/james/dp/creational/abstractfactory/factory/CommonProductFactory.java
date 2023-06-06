package com.shanghai.james.dp.creational.abstractfactory.factory;

import com.shanghai.james.dp.creational.abstractfactory.product.AbstractProductA;
import com.shanghai.james.dp.creational.abstractfactory.product.AbstractProductB;
import com.shanghai.james.dp.creational.abstractfactory.product.ProductACommon;
import com.shanghai.james.dp.creational.abstractfactory.product.ProductBCommon;

public class CommonProductFactory extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductACommon();
    }

    public AbstractProductB createProductB() {
        return new ProductBCommon();
    }
}
