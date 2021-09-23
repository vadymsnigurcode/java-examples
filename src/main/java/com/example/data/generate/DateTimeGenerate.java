package com.example.data.generate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateTimeGenerate {
    public String GetLocalDateTime() {
        long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2013-01-01 00:00:00").getTime();
        long diff = end - offset;
        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff + 1));

        String timeStamp = new SimpleDateFormat(
                "yyyy.MM.dd HH:mm:ss")
                .format(rand);
        System.out.println(timeStamp);
        return timeStamp;
    }

}
