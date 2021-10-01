package com.example.demo.lambda.comparator2;

import java.util.function.Function;

public interface Comparator<T> {

    public int compare(T t1, T t2);
    public static <U> Comparator<U> comparing(Function<U, Comparable> f) {
        return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
    }

}
