package com.example.demo.Generics.Maps;

import com.example.demo.Generics.Maps.Person;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTests {
    @Test
    public void testMaps() {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson",65);
        Person bertCooper = new Person("Bert Cooper", 100);

        Map<String, Person> madMan = new HashMap<>();
        madMan.put(donDraper.getName(),donDraper);
        System.out.println(madMan);
        System.out.println(madMan.get("Don Draper"));

        System.out.println("Keys");
        for (String name : madMan.keySet()) {
            System.out.println(name);
        }
        System.out.println("values");
        for (Person val : madMan.values()) {
            System.out.println(val);
        }
        System.out.println("entry sets");
        for (Map.Entry<String,Person> entry : madMan.entrySet()) {
            System.out.println(entry);
        }


        System.out.println("entry sets");
        for (Map.Entry<String,Person> entry : madMan.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
