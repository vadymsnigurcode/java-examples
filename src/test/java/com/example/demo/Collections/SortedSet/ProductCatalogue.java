package com.example.demo.Collections.SortedSet;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {

    private final SortedSet<Product> products
            = new TreeSet<>(Product.BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier)
    {
        products.addAll(supplier.products());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProducts = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProducts);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProducts = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProducts);
    }

    private Product findHeaviestLightVanProduct() {
        for (Product product:products) {
            if (product.getWeight() > 20)
            {
                return product;
            }
        }
        return products.last();
    }
}
