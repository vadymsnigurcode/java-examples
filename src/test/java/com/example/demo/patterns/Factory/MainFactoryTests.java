package com.example.demo.patterns.Factory;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class MainFactoryTests {

    @Test
    public void testCalendar() {

        Calendar cal = Calendar.getInstance();
        //Calendar cal = Calendar.get;
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testWebsiteFactory() {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());

    }

}
