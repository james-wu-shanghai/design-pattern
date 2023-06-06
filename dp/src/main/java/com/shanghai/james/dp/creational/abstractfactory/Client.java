package com.shanghai.james.dp.creational.abstractfactory;

import com.shanghai.james.dp.creational.abstractfactory.factory.AbstractFactory;
import com.shanghai.james.dp.creational.abstractfactory.factory.CommonProductFactory;
import com.shanghai.james.dp.creational.abstractfactory.factory.SimpleProductFactory;

public class Client {
    // use SimpleProductFactory build 2 products
    public void callSimpleProductService() {
        AbstractFactory factory = new SimpleProductFactory();
        factory.createProductA().supplyServiceA();
        factory.createProductB().supplyServiceB();
    }

    // use CommonProductFactory build 2 products
    public void callCommonProductService() {
        AbstractFactory factory = new CommonProductFactory();
        factory.createProductA().supplyServiceA();
        factory.createProductB().supplyServiceB();
    }


}
