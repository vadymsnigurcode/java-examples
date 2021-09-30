package com.example.demo.patterns.creational.Singleton;

public class DbSingletonLazyInit {
    private static DbSingletonLazyInit instance = null;

    private DbSingletonLazyInit() {
    }

    public static DbSingletonLazyInit getInstance() {
        if (instance == null) {
            instance = new DbSingletonLazyInit();
        }
        return instance;
    }
}
