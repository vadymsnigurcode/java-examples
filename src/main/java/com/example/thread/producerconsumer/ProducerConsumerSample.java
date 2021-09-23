package com.example.thread.producerconsumer;

public class ProducerConsumerSample {
    Object lock = new Object();
    private static int[] buffer;
    private static int count;

    public void execute() throws InterruptedException {
        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        Runnable producerTask = () -> {
            for (int i = 0; i < 50; i++) {
                producer.produce();
            }
            System.out.println("Done producing");
        };
        Runnable consumerTask = () -> {
            for (int i = 0; i < 50; i++) {
                consumer.consume();
            }
            System.out.println("Done consuming");
        };

        Thread consumerThread = new Thread(consumerTask);
        Thread producerThread = new Thread(producerTask);

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();

        System.out.println("Data in the buffer: " + count);
    }

    class Consumer {
        public void consume() {
            //Variant 1 (incorrect behavior)
//            while (isEmpty(buffer)) {
//            }
//            buffer[--count] = 0;

            //Variant 2 (incorrect behavior)
//            synchronized (lock) {
//                while (isEmpty(buffer)) {
//                }
//                buffer[--count] = 0;
//            }


            // Variant 3 - correct
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[--count] = 0;
                lock.notifyAll();
            }
        }
    }

    class Producer {
        public void produce() {
            //Variant 1 (incorrect behavior)
//            while (isFull(buffer)) {
//            }
//            buffer[count++] = 1;

            //Variant 2 (incorrect behavior)
//            synchronized (lock) {
//                while (isFull(buffer)) {
//                }
//                buffer[count++] = 1;
//            }

            // Variant 3 - correct
            synchronized (lock) {
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[count++] = 1;
                lock.notifyAll();
            }
        }
    }

    private boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    private boolean isEmpty(int[] buffer) {
        return count == 0;
    }


}
