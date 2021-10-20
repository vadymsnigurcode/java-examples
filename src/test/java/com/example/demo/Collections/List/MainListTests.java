package com.example.demo.Collections.List;

import com.example.demo.Collections.List.Product;
import org.junit.jupiter.api.Test;

// for contains and assertThat
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

public class MainListTests {

    @Test
    public void testListArrayListAdd() {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        final Shipment shipment = new Shipment();
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment, contains(door,window));
    }

    @Test
    public void testListArrayListReplaceItems() {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        final Shipment shipment = new Shipment();
        shipment.add(door);
        shipment.add(window);

        shipment.replace(door,floorPanel);

        assertThat(shipment,contains(floorPanel,window));
    }

    @Test
    public void testListArrayListReplaceMissingItems() {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        final Shipment shipment = new Shipment();

        shipment.add(window);

        shipment.replace(door,floorPanel);

        assertThat(shipment, contains(window));
    }

    @Test
    public void testListShouldIdentifyVanRequirements() {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        final Shipment shipment = new Shipment();

        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();

        assertThat(shipment.getLightVanProducts(), contains(window));
        assertThat(shipment.getHeavyVanProducts(), contains(floorPanel,door));
    }


}
