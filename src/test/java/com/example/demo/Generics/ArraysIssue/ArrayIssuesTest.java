package com.example.demo.Generics.ArraysIssue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayIssuesTest {

    @Test
    public void testArrayIssues() {
        Person donDraper = new Person("Don Drapper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person[] madMen = {donDraper, peggyOlson};
        System.out.println(Arrays.toString(madMen));
        Person bertCooper = new Person("Bert Coper", 100);
        madMen = add(bertCooper, madMen);
        System.out.println(Arrays.toString(madMen));
    }

    private Person[] add(final Person person, Person[] array) {
        int length = array.length;
        array = Arrays.copyOf(array, length+1);
        array[length] = person;
        return array;
    }
}
