package com.example.demo.Generics.Wildcard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PersonSaver {
    private final RandomAccessFile file;


    public PersonSaver(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file,"rw");
    }

    public void save(Person person) throws IOException {
        file.writeUTF(person.getClass().getName());
        file.writeUTF(person.getName());
        file.writeInt(person.getAge());
    }

    public void saveAll(Person[] persons) throws IOException {
        for (Person person :
                persons) {
            save(person);
        }
    }
}
