package com.example.demo.singleton_two_checks_example;

public class SingletonV2 {
    private static SingletonV2 instance;
    private static Object key;
    private SingletonV2() {

    }
    public static synchronized SingletonV2 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (key) { // too buggy
            if (instance == null) {
                instance = new SingletonV2();
            }
            return instance;
        }
    }
}
