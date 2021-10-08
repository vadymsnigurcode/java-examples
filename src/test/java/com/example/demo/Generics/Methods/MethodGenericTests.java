package com.example.demo.Generics.Methods;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MethodGenericTests {

    @Test
    public void testShouldRetainOrderOfOrderedPair() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
        final Person youngestCastMember =
                (Person) min(madMen, new AgeComparator());
        System.out.println(youngestCastMember);
        final Person youngestCastMember1 =
                (Person) min(madMen, new Comparator<Integer>() {
                    @Override
                    public int compare(final Integer o1, final Integer o2) {
                        return 0;
                    }
                });
        System.out.println(youngestCastMember);
    }

    @Test
    public void testErrorCast() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        final Person youngestCastMember =
                (Person) min(madMen, new Comparator<Integer>() {
                    @Override
                    public int compare(final Integer o1, final Integer o2) {
                        return 0;
                    }
                });
        System.out.println(youngestCastMember);
    }

    public static Object min(List values, Comparator comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }
        Object lowestElement = values.get(0);
        for (int i = 0; i <values.size(); i++) {
            final Object element = values.get(i);
            if (comparator.compare(element, lowestElement)<0) {
                lowestElement = element;
            }

        }
        return lowestElement;
    }


}
