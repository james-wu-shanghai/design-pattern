package com.shanghai.james.dp.creational.factorymethod.creator;

import com.shanghai.james.dp.creational.factorymethod.product.Product;
import com.shanghai.james.dp.creational.factorymethod.product.ProductB;

public class ProductBFactory implements ProductFactory {
    public Product createProduct() {
        return new ProductB();
    }
}
