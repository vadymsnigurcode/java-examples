package com.example.demo.Collections.TreeSet;

import org.junit.jupiter.api.Test;

import static com.example.demo.Collections.TreeSet.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class MainTreeSetTests {
    @Test
    public void testShouldOnlyHoldUniqueProducts() throws Exception
    {
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
        assertThat(catalogue, containsInAnyOrder(door,floorPanel));
    }
}
