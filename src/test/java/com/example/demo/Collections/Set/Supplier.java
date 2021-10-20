package com.example.demo.Collections.Set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Supplier {
    private final List<Product> products = new ArrayList<>();
    public Supplier(String s) {

    }

    public List<Product> products() {
        return products;
    }
}
