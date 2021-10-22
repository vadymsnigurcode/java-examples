package com.example.demo.Collections.ViewsOverMap;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final List<Product> products = new ArrayList<>();
    public Supplier(String s) {

    }

    public List<Product> products() {
        return products;
    }
}
