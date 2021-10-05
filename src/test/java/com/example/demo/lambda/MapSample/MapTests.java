package com.example.demo.lambda.MapSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapTests {
    public void testMap() {
        Person p1 = new Person("Alice",23);
        Person p2 = new Person("Brian",56);
        Person p3 = new Person("Chelsea",46);
        Person p4 = new Person("David",28);
        Person p5 = new Person("Erica",37);
        Person p6 = new Person("Francisco",18);

        List<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));
        people.forEach(System.out::println);



    }
}
