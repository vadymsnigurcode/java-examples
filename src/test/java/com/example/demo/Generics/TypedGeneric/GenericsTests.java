package com.example.demo.Generics.TypedGeneric;

import org.junit.jupiter.api.Test;

public class GenericsTests {

    CircularBuffer buffer = new CircularBuffer(2);

    @Test
    public void testShouldOrderPollableElement() {
        CircularBuffer<String> buffer = new CircularBuffer<String>(10);
        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");
        String value = concatenate(buffer);
        System.out.println(value);
    }

    private String concatenate(CircularBuffer<String> buffer) {
        StringBuilder result = new StringBuilder();
        String value;
        while ((value = (String) buffer.pool())!= null) {
            result.append(value);
        }
        return result.toString();
    }
}
