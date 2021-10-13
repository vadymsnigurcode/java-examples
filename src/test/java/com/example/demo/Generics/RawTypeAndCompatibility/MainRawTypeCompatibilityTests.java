package com.example.demo.Generics.RawTypeAndCompatibility;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainRawTypeCompatibilityTests {

    @Test
    public void testRawType() {
        List list = new ArrayList<>();
        list.add("abc");
        list.add(1);
        list.add(new Object());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final Object element = iterator.next();
            System.out.println(element);
        }



    }
}
