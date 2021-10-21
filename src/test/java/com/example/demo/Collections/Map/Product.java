package com.example.demo.Collections.Map;

import com.example.demo.lambda.Comparator;

public class Product {

    public static final Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);
    public static final Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);

    private final int id;
    private final String name;
    private final int weight;

    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
