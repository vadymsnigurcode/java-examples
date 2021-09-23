package com.example.data.generate;

import com.github.javafaker.Faker;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FakePersonGenerate {

    public Faker GenerateRandomPerson() {
        Locale locale = new Locale
                .Builder()
                .setLanguage("uk")
                .setRegion("UA")
                .build();
        Faker faker = new Faker(locale);
        //Faker faker = new Faker(new Locale("uk_UA"));
        //Faker faker = new Faker(new Locale("UA"));

        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Kiev"));
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().city());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.address().timeZone());
        System.out.println("Default locale is: " + Locale.getDefault());
        Date personBirth = faker.date().birthday();
//        System.out.println("gender is " + faker.gender().binaryTypes()); // ONLY FROM v.1.0.3
        System.out.println(personBirth);
        System.out.println(LocalDateTime.ofInstant(personBirth.toInstant(), ZoneId.of("UTC")));
        System.out.println(LocalDateTime.ofInstant(personBirth.toInstant(), ZoneId.of("Europe/Kiev")));
        System.out.println(LocalDateTime.ofInstant(personBirth.toInstant(), ZoneId.of("Europe/Moscow")));
        return faker;
    }
}
