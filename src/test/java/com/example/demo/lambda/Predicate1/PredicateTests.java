package com.example.demo.lambda.Predicate1;

import org.junit.jupiter.api.Test;

public class PredicateTests {

    @Test
    public void testPredicate() {
        Predicate<String> p = s ->s.length()<20;
        boolean b = p.test("Hello");
        System.out.println("Hello is shorter than 20 chars : " + b);

    }

}
