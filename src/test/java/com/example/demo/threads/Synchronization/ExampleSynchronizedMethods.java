package com.example.demo.threads.Synchronization;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampleSynchronizedMethods {
    private int sum = 0;

    //public synchronized void calculate() { // filed due to no synchronization
    public synchronized void calculate() {  // passed due to synchronization
        setSum(getSum() + 1);
    }
}
