package com.shanghai.james.dp.creational.factorymethod;

import com.shanghai.james.dp.creational.factorymethod.creator.ProductAFactory;
import com.shanghai.james.dp.creational.factorymethod.creator.ProductBFactory;

public class Client {
    public static void main(String[] args) {
        //offer service A
        new ProductAFactory().createProduct().offerService();

        //offer service B
        new ProductBFactory().createProduct().offerService();
    }
}
