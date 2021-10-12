package com.example.demo.Generics.Wildcard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PersonLoader {
    private final RandomAccessFile file;


    public PersonLoader(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file,"rw");
    }

    public Person load()
    {
        try {
            final String className = file.readUTF();
            final String personName = file.readUTF();
            final int age = file.readInt();
            final Class<?> personClass = Class.forName(className);
            final Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            return (Person) constructor.newInstance(personName, age);
        } catch (IOException | NoSuchMethodException e) {
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException|InstantiationException ex) {

        }
        return null;
    }

    public void loadAll(final List<? super Person> people) {
        Person person;
        while ((person = load()) != null) {
            people.add(person);
        }
    }
}
