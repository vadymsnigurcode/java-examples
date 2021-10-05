package com.example.demo.lambda.Predicate2;

import org.junit.jupiter.api.Test;

public class PredicateTests {

    @Test
    public void testPredicate() {
        Predicate<String> p1 = s ->s.length() < 20;
        Predicate<String> p2 = s ->s.length() > 5;
        Predicate<String> p3 = p1.and(p2);
        System.out.println("P3 for Yes: " +p3.test("Yes"));
        System.out.println("P3 for Good morning: " +p3.test("Good morning"));
        System.out.println("P3 for good morning gentlemen: " + p3.test("good morning gentlemen"));
    }

}
