package com.example.demo.Collections.Operations;

import java.util.Comparator;
import java.util.Objects;

public class Product {
    public static final Comparator<? super Product> BY_WEIGHT
            = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.getWeight(),p2.getWeight());
        }
    };

    public static final Comparator<Product> BY_NAME
            = Comparator.comparing(Product::getName);

    public int getId() {
        return id;
    }

    private final int id;

    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    private final String name;

    private final int weight;

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

// one way
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Product product = (Product) o;
//
//        if (weight != product.weight) return false;
//        return name != null ? name.equals(product.name) : product.name == null;
//    }


//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + weight;
//        return result;
//    }

    // second way

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,weight);
    }
}
