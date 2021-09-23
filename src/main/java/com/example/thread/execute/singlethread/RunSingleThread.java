package com.example.thread.execute.singlethread;

public class RunSingleThread {
    public RunSingleThread() {
        System.out.println("Run single thread example!!!");
    }

    public void executeThread() {
        Runnable runnable = () -> {
            System.out.println("I'm running in " + Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        t.setName("Thread name 1");
        t.start();
        //t.run(); // don't run thread on this way!!!

    }
}
