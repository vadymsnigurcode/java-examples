package com.example.demo.threads.FalseSharing;


import org.junit.jupiter.api.Test;

import static com.example.demo.threads.FalseSharing.FalseSharing.runBenchmark;

public class TestsThreadsFalseSharingVariables {
    @Test
    public void testThreadsFalseSharingVariables() throws InterruptedException {
        runBenchmark();
    }
}


