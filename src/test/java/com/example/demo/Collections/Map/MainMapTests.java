package com.example.demo.Collections.Map;

import org.junit.Test;

import java.util.List;

public class MainMapTests {
    @Test
    public void testMap() {
        runLookups(new MapProductLookupTable());
        runLookups(new NativeProductLookupTable());

    }

    private static void runLookups(final ProductLookupTable lookupTable) {
        final List<Product> products = LookupTableComparison.products;
        System.out.println("Running lookups with "+ lookupTable.getClass().getSimpleName());
        for (int i = 0; i < LookupTableComparison.ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();
            for (Product product:products) {
                lookupTable.addProduct(product);
            }
            for (Product product:products) {
                final Product result = lookupTable.lookupById(product.getId());
                if (result != product)
                {
                    throw new IllegalArgumentException("Lookup Table returned wrong result for " + "");
                }
                lookupTable.clear();

                System.out.println(System.currentTimeMillis() - startTime + "ms");

            }


        }

    }
}
