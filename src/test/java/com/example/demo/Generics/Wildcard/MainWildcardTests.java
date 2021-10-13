package com.example.demo.Generics.Wildcard;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainWildcardTests {
    private Partner donDraper = new Partner("Don Draper",89);
    private Partner bertCooper = new Partner("Bert Cooper",100);
    private Employee peggyOlson  = new Employee("Peggy Olson", 65);

    private File file;
    private PersonSaver saver = new PersonSaver(new File("person"));
    private PersonLoader loader = new PersonLoader(new File("person"));

    public MainWildcardTests() throws FileNotFoundException {
    }

    @Test
    public void testListLoadPerson() throws IOException, ClassNotFoundException {
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(new Person("Don Draper",89));
        System.out.println(objects);

    }

    @Test
    public void testPersonStorageSavesAndLoadPerson() throws IOException, ClassNotFoundException {
        Person person = new Person("Bob",20);
        saver.save(person);
        assertEquals(person,loader.load());
    }

    @Test
    public void testSaveAndLoadsArraysOfPeople() throws ClassNotFoundException {
            Person[] persons = new Person[2];
            persons[0] = donDraper;
            persons[1] = bertCooper;
        try {
            saver.saveAll(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(donDraper, loader.load());
        assertEquals(bertCooper,loader.load());

    }

    @Test
    public void testSaveAndLoadsArraysOfPartner() throws ClassNotFoundException {
        Partner[] partners = new Partner[2];
        Person[] persons = partners;
        persons[0] = donDraper;
        persons[1] = bertCooper;
        try {
            saver.saveAll(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(donDraper, loader.load());
        assertEquals(bertCooper,loader.load());

    }
}

