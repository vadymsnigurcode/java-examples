package com.example.demo.Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;

    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    public void add(Product product)
    {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct)
    {
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT)
        {
            products.set(index, newProduct);
        }
    }
    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public void prepare() {
        //sort

        products.sort(Product.BY_WEIGHT);

        //find
        int splitPoint = findSplitPoint();

        //assign
        lightVanProducts = products.subList(0,splitPoint);
        heavyVanProducts = products.subList(splitPoint,products.size());

    }

    private int findSplitPoint() {
        for (int i = 0; i < products.size(); i++) {
            final Product product = products.get(i);

            if (product.getWeight()>LIGHT_VAN_MAX_WEIGHT)
            {
                return i;
            }
        }
        return 0;
    }
}
