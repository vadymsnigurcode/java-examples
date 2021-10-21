package com.example.demo.Collections.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StackTests {

    private Calculator calculator = new Calculator();

    @Test
    public void testStackShouldEvaluateConstants() {
        int result = calculator.evaluate("1");
        assertEquals(1, result);
    }

    @Test
    public void testStackSupportAdding() {
        int result = calculator.evaluate("1 + 2");
        assertEquals(3, result);
    }

    @Test
    public void testStackSupportSubtraction()
    {
        int result = calculator.evaluate("1 - 2");
        assertEquals(-1, result);
    }

    @Test
    public void testStackComplexStatements() {
        int result = calculator.evaluate("1 - 3 + 2 + 4");
        assertEquals(4, result);
    }
}
