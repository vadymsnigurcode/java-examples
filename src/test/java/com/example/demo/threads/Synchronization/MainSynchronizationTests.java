package com.example.demo.threads.Synchronization;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static com.helger.commons.mock.CommonsAssert.assertEquals;

public class MainSynchronizationTests {
    @Test
    public void testSynchronizeMethods() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        ExampleSynchronizedMethods summation = new ExampleSynchronizedMethods();
        IntStream.range(0, 1000).forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        assertEquals(1000, summation.getSum());
    }
}
