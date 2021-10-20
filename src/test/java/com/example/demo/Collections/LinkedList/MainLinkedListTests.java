package com.example.demo.Collections.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedListTests {
    @Test
    public void testLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + ";");
        }
    }
}
