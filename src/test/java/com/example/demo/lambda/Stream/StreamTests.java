package com.example.demo.lambda.Stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTests {
    @Test
    public void testStreamDefinition() {
        List<Person> people = new ArrayList<>();
        Stream<Person> stream = people.stream();

        System.out.println(Stream.empty());
        Stream.of("one");
        Stream.of("one", "two", "three");

        Stream.generate(() -> "one");

        Stream.iterate("+", s -> s + "+");

        ThreadLocalRandom.current().ints();
        IntStream stream1 = "hello".chars();
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one").add("two").add("three");
        builder.accept("four"); // does not return anything
        Stream<String> stream2 = builder.build();

        stream2.forEach(System.out::println);

    }

    @Test
    public void testPrintPersons() {
        List<Person> persons = new ArrayList<>();
        persons.stream()                // Stream<Person>
                .map(p -> p.getAge())     // Stream<Integer>
                .filter(age -> age > 20)    // Stream<Integer>
                .forEach(System.out::println);

//        persons.stream()                // Stream<Person>
//                //.map(p->p.getAge())     // Stream<Integer>
//                .filter(age->age>20)    // Stream<Integer>
//                .forEach(System.out::println);

//        persons.stream()                // Stream<Person>
//                .map(p->p.getAge())     // Stream<Integer>
//                .forEach(System.out::println)  //DOES NOT COMPILE
//                .filter(age->age>20)    // Stream<Integer>
//                .forEach(System.out::println);

        persons.stream()                // Stream<Person>
                .map(p -> p.getAge())     // Stream<Integer>
                .peek(System.out::println)  //DOES NOT COMPILE
                .filter(age -> age > 20)    // Stream<Integer>
                .forEach(System.out::println);
    }

    @Test
    public void testSkipLimitTesting() {
        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Brian", 56);
        Person p3 = new Person("Chelsea", 15);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Erica", 37);
        Person p6 = new Person("Francisco", 18);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
        persons.stream()
                .skip(2)
                .limit(3)
                .filter(person -> person.getAge() > 20)
                .forEach(System.out::println);

//        Optional<Person> opt = persons
//                .stream()
//                .findAny((Person) p -> p.getAge() > 20 );

    }

    @Test
    public void testSimpleStreams() {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);
        Stream<Integer> stream1 = ints.stream();
        stream1.forEach(System.out::println);

        Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);
        stream.forEach(System.out::println);

        Stream<String> stringStream = Stream.generate(() -> "one");
        stringStream.limit(5).forEach(System.out::println);


    }

    @Test
    public void testSimpleStreamsLimit() {
        Stream<String> stringStream = Stream.generate(() -> "one");
        stringStream.limit(5).forEach(System.out::println);
    }

    @Test
    public void testSimpleStreamsIterate() {
        Stream<String> streamOfString = Stream
                .iterate("+", s -> s + "+");
        streamOfString.limit(5).forEach(System.out::println);
    }

    @Test
    public void testSimpleStreamsThreadLocalRandom() {
        IntStream streamOfInt = ThreadLocalRandom.current().ints();
        streamOfInt.limit(5).forEach(System.out::println);
    }

}
