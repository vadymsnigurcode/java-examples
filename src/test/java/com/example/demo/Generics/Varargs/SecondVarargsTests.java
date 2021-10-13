package com.example.demo.Generics.Varargs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondVarargsTests {
    @Test
    public void testVarargs()
    {
/*        Integer[] integers = arrayOf(1,2);
        System.out.println(Arrays.toString(integers));
        System.out.println(integers.getClass());*/
        
        Object[] strs = pair("a");
        System.out.println(Arrays.toString(strs));
        System.out.println(strs.getClass());

        Integer[] pair = pair(1);
        System.out.println(Arrays.toString(pair));
        System.out.println(pair.getClass());
    }

    @Test
    public void testVarargsUsingCombineMethod()
    {
/*        Integer[] integers = arrayOf(1,2);
        System.out.println(Arrays.toString(integers));
        System.out.println(integers.getClass());*/

//        Object[] strs = combine(Arrays.asList("a"));
//        System.out.println(Arrays.toString(strs));
//        System.out.println(strs.getClass());
//
//        Integer[] pair = combine(1);
//        System.out.println(Arrays.toString(pair));
//        System.out.println(pair.getClass());
    }

    private static <T> T[] pair(T t)
    {
        return arrayOf(t, t);
    }

    // this is not safe code
    //@SafeVarargs
    private static <T> T[] arrayOf(T ... values)
    {
        return values;
    }

    @SafeVarargs
    private static <T> List<T> combine(List<? extends T> ... lists)
    {
        List<T> combined = new ArrayList<>();
        for (List<? extends T> list : lists)
        {
            combined.addAll(list);
        }
        return combined;
    }
}
