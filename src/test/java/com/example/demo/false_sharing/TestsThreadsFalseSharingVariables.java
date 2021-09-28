package com.example.demo.false_sharing;


import org.junit.jupiter.api.Test;

import static com.example.demo.false_sharing.FalseSharing.runBenchmark;

public class TestsThreadsFalseSharingVariables {
    @Test
    public void testThreadsFalseSharingVariables() throws InterruptedException {
        runBenchmark();
    }
}


