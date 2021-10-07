package com.example.demo.Generics.TypedGeneric;

public class CircularBuffer<T> {


    private T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size) {
        buffer = (T[]) new Object[size];
    }
    public boolean offer(T value) {
        if (buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }
    public T pool() {
        final T value = buffer[readCursor];
        if (buffer[readCursor] != null) {
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    public int next(int index) {
        return (index + 1)% buffer.length;
    }
}
