package com.example.demo.patterns.Singleton;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDbSingletonTests {

    @Test
    public void testDbSingleton() {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton instance2 = DbSingleton.getInstance();
        System.out.println(instance2);

    }

    @Test
    public void testDbSingletonLazy() {
        DbSingletonLazyInit instance = DbSingletonLazyInit.getInstance();
        System.out.println(instance);
        DbSingletonLazyInit instance2 = DbSingletonLazyInit.getInstance();
        System.out.println(instance2);
    }

    @Test
    public void testDbSingletonThreadSave() {
        DbSingletonThreadSave instance = DbSingletonThreadSave.getInstance();
        System.out.println(instance);
        DbSingletonThreadSave instance2 = DbSingletonThreadSave.getInstance();
        System.out.println(instance2);
    }

    @Test
    public void testDbSingletonDerbyDb() {
        DbSingletonDerbyDb instance = DbSingletonDerbyDb.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;
        System.out.println(instance);
        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println("creation time = " + (timeAfter - timeBefore));

        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                            " City VARCHAR(20))");
            System.out.println("Table created.");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println("next connection time is :" + (timeAfter - timeBefore));
    }
}
