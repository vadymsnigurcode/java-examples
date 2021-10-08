package com.example.demo.Generics.TypeBounds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CollectionTests {

    @Test
    public void testShouldRetainOrderOfOrderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(1,2);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }
    @Test
    public void testShouldFlipOfMisorderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(2,1);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }
}
