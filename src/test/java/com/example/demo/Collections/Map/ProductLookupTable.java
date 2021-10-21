package com.example.demo.Collections.Map;

public interface ProductLookupTable {

    void addProduct(final Product productToAdd);

    Product lookupById(final int id);

    void clear();

}
