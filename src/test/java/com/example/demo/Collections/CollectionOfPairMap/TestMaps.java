package com.example.demo.Collections.CollectionOfPairMap;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class TestMaps {

    @Test
    public void testCollectionOverMap() {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants",100);
        final Map<Integer,Product> idToProduct = new HashMap<>();

        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        Product result = idToProduct.get(10);
        System.out.println(result);

        Product result1 = idToProduct.getOrDefault(10,defaultProduct);
        System.out.println(result1);
    }

    @Test
    public void testReplaceMap() {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants",100);
        final Map<Integer,Product> idToProduct = new HashMap<>();

        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        Product result = idToProduct.replace(1,new Product(1, "Big Door", 50));
        System.out.println(result);
        System.out.println(idToProduct.get(1));
    }

    @Test
    public void testReplaceAllMap() {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants",100);
        final Map<Integer,Product> idToProduct = new HashMap<>();

        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        System.out.println(idToProduct);

        idToProduct.replaceAll((id, oldProduct) ->
                new Product(id,oldProduct.getName(),oldProduct.getWeight()+10));

        System.out.println(idToProduct);
    }

    @Test
    public void testComputeIfAbsentMap() {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants",100);
        final Map<Integer,Product> idToProduct = new HashMap<>();

        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        System.out.println(idToProduct);

        Product result =  idToProduct.computeIfAbsent(10, (id) ->
                new Product(id, "Custom Product",10));

        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println(idToProduct);

    }

    @Test
    public void testForEachMap() {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants",100);
        final Map<Integer,Product> idToProduct = new HashMap<>();

        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        System.out.println(idToProduct);
        idToProduct.forEach((key,value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
