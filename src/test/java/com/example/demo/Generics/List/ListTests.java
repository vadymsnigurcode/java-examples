package com.example.demo.Generics.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTests {

    @Test
    public void testLists() {
        Person donDraper = new Person("Don Drapper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        List<Person> madMen = new ArrayList<Person>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);

        System.out.println(madMen);

        madMen.add(new Person("Bert Cooper", 100));
        System.out.println(madMen);

        System.out.println(madMen.size());
        System.out.println(madMen.get(2));

        for (int i = 0; i < madMen.size(); i++) {
            final Person person = madMen.get(i);
            System.out.println(person);
        }

        final Iterator<Person> iterator = madMen.iterator();
        iterator.hasNext();
        while (iterator.hasNext()) {
            final Person person = iterator.next();
            System.out.println(person);
        }

        for (Person p: madMen) {
            System.out.println(p);
        }
    }
}
