package com.example.demo.predicate;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class PredicateTests {

    @Test
    public void testPredicateWithLambdaSample() {
        Predicate<String> p = (String s) -> s.length()<20;
        Predicate<String> p2 = s -> s.length()<20;
        System.out.println(p.test("Hello World!"));
    }
    @Test
    public void testPredicateSample() {
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };

    }
}
