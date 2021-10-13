package com.example.demo.Generics.IntersectTypes;

import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

public class PersonReader {

    public Person read(final DataInputStream source) {
        try (DataInputStream input = source) {
            return new Person(input.readUTF(), input.readInt());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <T extends DataInput & Closeable> Person read(final T source) {
        try (T input = source) {
            return new Person(input.readUTF(), input.readInt());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
