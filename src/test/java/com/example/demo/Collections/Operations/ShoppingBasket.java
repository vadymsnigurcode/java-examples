package com.example.demo.Collections.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingBasket {
    private final List<Product> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add(Product product) {
        items.add(product);
        totalWeight += product.getWeight();
    }

    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "items=" + items +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
