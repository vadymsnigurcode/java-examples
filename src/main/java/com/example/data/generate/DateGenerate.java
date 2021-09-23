package com.example.data.generate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class DateGenerate {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public LocalDate generateDateOnly() {
        return generateDateOnly(1900,2015,1,1,1,1);
    }
    public LocalDate generateDateOnly(int yearFrom, int yearTo, int monthFrom, int monthTo, int dayFrom, int dayTo) {
        Random random = new Random();
        int minDay = (int) LocalDate.of(yearFrom, monthFrom, dayFrom).toEpochDay();
        int maxDay = (int) LocalDate.of(yearTo, monthTo, dayTo).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

        System.out.println(randomBirthDate);

        return randomBirthDate;
    }
}
