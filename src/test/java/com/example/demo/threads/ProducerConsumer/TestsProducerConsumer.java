package com.example.demo.threads.ProducerConsumer;


import com.example.demo.threads.ProducerConsumer.singlethread.RunSingleThread;
import com.example.demo.threads.ProducerConsumerV2.ProducerConsumerSample;
import org.junit.jupiter.api.Test;


public class TestsProducerConsumer {
    @Test
    public void testSingleProducerConsumer() throws InterruptedException {
		RunSingleThread runSingleThread = new RunSingleThread();
		runSingleThread.executeThread();
		ProducerConsumerSample producerConsumerSample = new ProducerConsumerSample();
		producerConsumerSample.execute();
    }
}
