package com.example.demo.Collections.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LookupTableComparison {
    static final int ITERATIONS = 5;
    static final int NUMBER_OF_PRODUCTS = 20_000;

    static final List<Product> products = generateProducts();

    private static List<Product> generateProducts() {
        final List<Product> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            products.add(new Product(i,"Product"+i,10+weightGenerator.nextInt(10)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }


}
