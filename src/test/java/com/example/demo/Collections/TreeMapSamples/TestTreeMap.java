package com.example.demo.Collections.TreeMapSamples;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;
import java.util.concurrent.TransferQueue;

public class TestTreeMap {
    @Test
    public void testTreeMap() {
        final TreeMap<String,String> treeifield = new TreeMap<>();
        for (int i = 0; i < 26; i++) {
            final String value = String.valueOf(i);
            treeifield.put(value,value);
        }
        System.out.println(treeifield);

    }
}
