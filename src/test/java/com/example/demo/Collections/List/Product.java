package com.example.demo.Collections.List;

import java.util.Comparator;

public class Product {
    // one way
//    public static final Comparator<? super Product> BY_WEIGHT
//            = Comparator.comparing(Product::getWeight);

    // second way for older than java 8 version
    public static final Comparator<? super Product> BY_WEIGHT
            = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.getWeight(),p2.getWeight());
        }
    };

    private final String name;

    private final int weight;
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
