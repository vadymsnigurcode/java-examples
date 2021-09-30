package com.java11.StringFunctions;

import org.junit.jupiter.api.Test;

public class StringTests {
    @Test
    public void testStringTruncating() {
        System.out.println(" ".isBlank());
        System.out.println(" LR ".strip());
        System.out.println(" LR ".stripLeading());
        System.out.println(" LR ".stripTrailing());
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
    }
}
