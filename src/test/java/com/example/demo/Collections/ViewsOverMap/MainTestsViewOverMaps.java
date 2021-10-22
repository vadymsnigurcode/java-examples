package com.example.demo.Collections.ViewsOverMap;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainTestsViewOverMaps {
    @Test
    public void testViewOverMaps() {
        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println(idToProduct);
        System.out.println();
        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        //ids.add(4); //ERROR

        final Collection<Product> products = idToProduct.values();
        System.out.println(products);
        System.out.println();

        products.remove(ProductFixtures.floorPanel);
        System.out.println(products);
        System.out.println(idToProduct);
        System.out.println();

        //products.add(ProductFixtures.floorPanel);//ERROR as ID is not defined

        final Set<Map.Entry<Integer,Product>> entries = idToProduct.entrySet();
        for (Map.Entry<Integer,Product> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue(ProductFixtures.floorPanel);
        }
        System.out.println(idToProduct);


    }
}
