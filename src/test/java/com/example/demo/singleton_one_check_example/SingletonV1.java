package com.example.demo.singleton_one_check_example;

public class SingletonV1 {
    private static SingletonV1 instance;
    private SingletonV1() {

    }
    public static synchronized SingletonV1 getInstance() {
        if (instance == null) {
            instance = new SingletonV1();
        }
        return instance;
    }
}
