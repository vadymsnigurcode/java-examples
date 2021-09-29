package com.example.demo.generate;

import com.example.data.generate.CurrentDate;
import com.example.data.generate.DateGenerate;
import com.example.data.generate.DateTimeGenerate;
import com.example.data.generate.MillisecondsGenerate;
import org.junit.jupiter.api.Test;

public class DataGenerateTests {
    @Test
    public void testGenerateDate() {
        CurrentDate currentDate = new CurrentDate();
		currentDate.GetCurrentDateTime();
		currentDate.GetCurrentTime();
		currentDate.GetCurrentDate();
    }

    @Test
    public void testDateGenerate() {
   		DateGenerate dateGenerate = new DateGenerate();
		dateGenerate.generateDateOnly();
		dateGenerate.generateDateOnly(2020,2021,1,1,1,1);
    }

    @Test
    public void testDateTimeGenerate() {
		DateTimeGenerate dateTimeGenerate = new DateTimeGenerate();
		dateTimeGenerate.GetLocalDateTime();
    }

    @Test
    public void testMillisecondsGenerate() {
   		MillisecondsGenerate milGenerate = new MillisecondsGenerate();
		milGenerate.generateTimeInMilliseconds();
    }


}
