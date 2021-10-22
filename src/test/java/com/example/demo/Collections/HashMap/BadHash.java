package com.example.demo.Collections.HashMap;

public class BadHash {
    String value;
    Integer hash;

    public BadHash(String value, Integer hash) {
        this.value = value;
        this.hash = hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadHash badHash = (BadHash) o;


        return value.equals(badHash.value);
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public String toString() {
        return "BadHash{" +
                "value='" + value + '\'' +
                ", hash=" + hash +
                '}';
    }
}
