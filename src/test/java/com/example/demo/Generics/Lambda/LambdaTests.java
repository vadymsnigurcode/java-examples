package com.example.demo.Generics.Lambda;

import com.example.demo.Generics.Maps.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class LambdaTests {

    @Test
    public void testGenericWithLambda() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);
        Predicate<Person> isOld = person -> (person.getAge()>80);
        System.out.println(isOld.test(donDraper));
        System.out.println(isOld.test(peggyOlson));

        List<Person> people = new ArrayList<>();
        people.add(donDraper);
        people.add(peggyOlson);
        people.add(bertCooper);
        final Map<Boolean,List<Person>> oldAndYoungPeople = people
                .stream()
                .collect(Collectors.partitioningBy(isOld));
        System.out.println(oldAndYoungPeople);

        final Map<Boolean, Long> oldAndYoungPeople1 = people
                .stream()
                .collect(Collectors.partitioningBy(person -> person.getAge()>80,
                        counting()));
        System.out.println(oldAndYoungPeople1);




    }
}
