package com.example.demo.Collections.SortedSet;

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
