package com.java11.Predicate;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTests {
    @Test
    public void testPredicate() {
        List<Integer> numbers = List.of(3,4,5,67,89,88);
        Predicate<Integer> evenNumberPredicate= number->number%2==0;
        numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
        System.out.println("negate condition effect:");
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
    }

    @Test
    public void testPredicateUseFunction() {
        List<Integer> numbers = List.of(3,4,5,67,89,88);
        numbers.stream().filter(PredicateTests::isEven).forEach(System.out::println);
    }

    private static boolean isEven(Integer number) {
        return number%2==0;
    }
}
