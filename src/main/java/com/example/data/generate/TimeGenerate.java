package com.example.data.generate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Random;

public class TimeGenerate {

    public String GetRandomTime() {
        long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2013-01-01 00:00:00").getTime();
        long diff = end - offset;
        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff + 1));

        String timeStamp = new SimpleDateFormat(
                "HH:mm:ss")
                .format(rand);
        System.out.println(timeStamp);
        return timeStamp;
    }
}
