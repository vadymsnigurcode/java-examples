package com.example.demo.Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainCollectionsTests {

    @Test
    public void testCollectionInterface() {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        System.out.println(products);

        final Iterator<Product> productIterator = products.iterator();

        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }

        for (Product product:products) {
            System.out.println(product);
        }

        // Using an iterator possible
        // to delete item in the collection
        // we can't do this using foreach loop
        final Iterator<Product> productIterator1 = products.iterator();
        while (productIterator1.hasNext()) {
            Product product = productIterator1.next();
            if (product.getWeight() > 20)
            {
                System.out.println(product);
            } else
            {
                productIterator1.remove();
            }
        }
        System.out.println(products);

        System.out.println("products.size()= " + products.size());
        System.out.println("products.isEmpty()= " + products.isEmpty());
        System.out.println("products.contains(window)=" + products.contains(window));
        System.out.println("products.contains(door)=" + products.contains(door));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);
        products.removeAll(otherProducts);
        System.out.println(products);
        products.remove(window);
        System.out.println(products);
    }

    @Test
    public void testListLinkedList() {

    }

    public void testSetHashSet() {

    }

    @Test
    public void testSortedSetTreeSet() {

    }

    @Test
    public void testQueuePriorityQueue() {

    }

    @Test
    public void testDequeLinkedList() {

    }

    @Test
    public void testDequeArrayDeque() {

    }

    @Test
    public void testMapHashMap() {

    }

    @Test
    public void testSortedMapTreeMap() {

    }
}
