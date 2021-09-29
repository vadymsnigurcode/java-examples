package com.example.demo.patterns.Singleton;

public class DbSingletonThreadSave {
    private static volatile DbSingletonThreadSave instance = null;

    private DbSingletonThreadSave() {
        if (instance!=null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonThreadSave getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSave();
                }
            }
        }
        return instance;
    }
}
