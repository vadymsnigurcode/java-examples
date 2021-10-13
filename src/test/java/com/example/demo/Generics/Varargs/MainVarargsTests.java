package com.example.demo.Generics.Varargs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainVarargsTests {
    @Test
    public void testVarargs()
    {
        Integer[] integers = arrayOf(1,2);
        System.out.println(Arrays.toString(integers));
        System.out.println(integers.getClass());

    }

    private static <T> T[] arrayOf(T ... values)
    {
        return values;
    }
}
