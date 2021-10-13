package com.example.demo.Generics.IntersectTypes;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;


    public Person(String name, int age) {
        Objects.requireNonNull(name);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
