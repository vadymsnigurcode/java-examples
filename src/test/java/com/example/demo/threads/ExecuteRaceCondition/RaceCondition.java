package com.example.demo.threads.ExecuteRaceCondition;

import org.junit.jupiter.api.Test;

public class RaceCondition {

    @Test
    public void testExecute() throws InterruptedException {
         LongWrapper longWrapper = new LongWrapper(0L);
         Runnable r = () -> {
             for (int i = 0; i<1_000; i++) {
                 longWrapper.incrementValue();
             }
         };
         Thread[] threads = new Thread[1_1000];
         for (int i = 0; i < threads.length; i++) {
             threads[i] = new Thread(r);
             threads[i].start();
         }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println("Value = " + longWrapper.getL());

    }

}
