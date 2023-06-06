package com.shanghai.james.dp.creational.factorymethod.creator;

import com.shanghai.james.dp.creational.factorymethod.product.Product;
import com.shanghai.james.dp.creational.factorymethod.product.ProductA;

public class ProductAFactory implements ProductFactory {
    public Product createProduct() {
        return new ProductA();
    }
}
