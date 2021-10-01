package com.example.demo.lambda.comparator1;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExpressionTests {
    @Test
    public void testRunnableOutput() {
        Runnable r=()-> {
            int i=0;
            while (i++ < 10) {
                System.out.println("It works!");
            }
        };
        r.run();
    }

    @Test
    public void testFunctionTemplate() {

    }
    @Test
    public void testFunctionComparator() {

         Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();

        Comparator<Person> cmpPersonAge = Comparator.comparing(p->p.getAge());
        Comparator<Person> cmpPerson2 = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(p->p.getAge());



    }

    @Test
    public void testFunctionMethodReference() {
        Function<Person,Integer> f1_1 = Person::getAge;
        Function<Person,Integer> f2_1 = person -> person.getAge();
        BinaryOperator<Integer> sum1 = (i1,i2) -> i1 +i2;
        BinaryOperator<Integer> sum2 = (i1,i2) -> Integer.sum(i1,i2);
        BinaryOperator<Integer> sum3 = Integer::sum;

        Consumer<String> printer = System.out::println;

        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge()-p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p2.getLastName().compareTo(p1.getLastName());

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();

        Comparator<Person> cmpPerson = Comparator.comparing(f1);

    }

    @Test
    public void testFunction1() {
        Function<Person,Integer> f = person -> {
            int age = person.getAge();
            System.out.println(age);
            return null;
        };

        Person p = new Person();
        f.apply(p);

    }


}
