package com.example.data.generate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MilGenerate {

    public long generateTimeInMilliseconds() {
        long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2013-01-01 00:00:00").getTime();
        long diff = end - offset;
        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff + 1));

        System.out.println(rand.getTime());
        return rand.getTime();
    }
}
