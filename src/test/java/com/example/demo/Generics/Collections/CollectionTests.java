package com.example.demo.Generics.Collections;

import org.junit.Test;

import java.util.*;

public class CollectionTests {

    @Test
    public void testCollections() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
        System.out.println(madMen);
        Collections.sort(madMen, new AgeComparator());

        System.out.println(madMen);
    }

    @Test
    public void testCollections01() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
        System.out.println(madMen);
        Collections.sort(madMen, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person1.getAge(),person2.getAge());
            }
        });

        System.out.println(madMen);
    }
}
