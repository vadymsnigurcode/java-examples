package com.example.demo.Collections.Map;

import java.util.ArrayList;
import java.util.List;

public class NativeProductLookupTable implements ProductLookupTable {

    private List<Product> products = new ArrayList<>();


    @Override
    public void addProduct(final Product productToAdd)
    {
        for (Product product:products)
        {
            if (product.getId() == productToAdd.getId())
            {
                throw new IllegalArgumentException(
                        "Unable to add product, duplicate id for"
                        + productToAdd
                );
            }
        }
        products.add(productToAdd);
    }

    @Override
    public Product lookupById(final int id)
    {
        for(Product product: products) {
            if (product.getId() == id)
            {
                return product;
            }
        }
        return null;
    }

    public void clear()
    {

    }
}
