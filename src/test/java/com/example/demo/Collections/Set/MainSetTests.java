package com.example.demo.Collections.Set;

import org.junit.jupiter.api.Test;
// for contains and assertThat
import static com.example.demo.Collections.Set.ProductFixtures.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

public class MainSetTests {
    @Test
    public void testShouldOnlyHoldUniqueProducts() throws Exception
    {
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
        assertThat(catalogue, containsInAnyOrder(door,floorPanel));
    }
}
