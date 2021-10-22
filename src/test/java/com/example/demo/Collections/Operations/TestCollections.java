package com.example.demo.Collections.Operations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    @Test
    public void testRotations() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);
        System.out.println();

        Collections.rotate(products,1);
        System.out.println(products);

        Collections.rotate(products,1);
        System.out.println(products);

        Collections.rotate(products,1);
        System.out.println(products);
    }


    @Test
    public void testShuffle() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);
        System.out.println();

        Collections.shuffle(products);
        System.out.println(products);

        Collections.shuffle(products);
        System.out.println(products);

        Collections.shuffle(products);
        System.out.println(products);
    }

    @Test
    public void testSorting() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);

        Collections.sort(products, Product.BY_WEIGHT);
        System.out.println(products);

        Collections.sort(products, Product.BY_NAME);
        System.out.println(products);

        products.sort(Product.BY_NAME);
        System.out.println(products);
    }
}
