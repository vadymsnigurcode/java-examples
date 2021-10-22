package com.example.demo.Collections.Operations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionUtilities {
    @Test
    public void testAddAll() {
        Product door = ProductFixtures.door;
        Product floorPanel = ProductFixtures.floorPanel;
        Product window = ProductFixtures.window;

        List<Product> products = new ArrayList<>();
        Collections.addAll(products, door,floorPanel,window);
        System.out.println(products);

        final Product product = Collections.min(products,Product.BY_NAME);
        System.out.println(product);

        final Product product1 = Collections.max(products,Product.BY_WEIGHT);
        System.out.println(product1);

    }
}
