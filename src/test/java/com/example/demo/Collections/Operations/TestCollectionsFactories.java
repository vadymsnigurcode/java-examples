package com.example.demo.Collections.Operations;

import org.junit.Test;

public class TestCollectionsFactories {

    @Test
    public void testUnmodifiableCollection() {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add(ProductFixtures.door);
        System.out.println(basket);

        basket.getItems().add(ProductFixtures.window);
        System.out.println(basket);

    }
}
