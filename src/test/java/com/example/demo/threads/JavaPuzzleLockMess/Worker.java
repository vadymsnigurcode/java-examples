package com.example.demo.threads.JavaPuzzleLockMess;

public class Worker extends Thread {

    private Object lock = new Object();
    private volatile boolean quittingTime = false;

    public void run() {
        while (!quittingTime) {
            working();
            System.out.println("Still working...");
        }
        System.out.println("Coffee is good!");
    }
    private void working() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {}
    }

     synchronized void quit() throws InterruptedException {
        synchronized (lock) {
            quittingTime = true;
            System.out.println("calling join");
            join();
            System.out.println("back from join");
        }
    }

    public void keepWorking() {
        synchronized (lock) {
            quittingTime = false;
            System.out.println("Keep working");
        }
    }

}
