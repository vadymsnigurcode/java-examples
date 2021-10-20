package com.example.demo.Collections.SortedSet;

import org.junit.jupiter.api.Test;

import static com.example.demo.Collections.SortedSet.ProductFixtures.*;
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
