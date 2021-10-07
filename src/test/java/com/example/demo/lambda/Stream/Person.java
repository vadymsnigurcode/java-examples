package com.example.demo.lambda.Stream;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    int Age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
