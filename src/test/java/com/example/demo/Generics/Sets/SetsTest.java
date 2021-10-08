package com.example.demo.Generics.Sets;

import com.example.demo.Generics.List.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsTest {
    @Test
    public void testListProblem() {
        Person donDraper = new Person("Don Drapper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        List<com.example.demo.Generics.List.Person> madMen = new ArrayList<Person>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(donDraper);
        for (Person p : madMen) {
            System.out.println(p);

        }
    }

    @Test
    public void testSets() {
        Person donDraper = new Person("Don Drapper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);
        Set<Person> madMen = new HashSet<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(donDraper);
        for (Person p : madMen) {
            System.out.println(p);

        }

        System.out.println(madMen.contains(donDraper));
        System.out.println(madMen.contains(bertCooper));

    }

}
