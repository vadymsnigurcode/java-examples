package com.example.demo.JavaPuzzleLockMess;

import org.junit.jupiter.api.Test;

import java.util.Timer;
import java.util.TimerTask;

public class TestsJavaPuzzleLockMess {
    @Test
    public void testSample() throws InterruptedException {
        final Worker worker = new Worker();
        worker.start();
        Timer t = new Timer(true);
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                worker.keepWorking();
            }
        }, 500);
        Thread.sleep(400);
        worker.quit();
    }
}
