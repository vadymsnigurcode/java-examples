package com.example.thread.execute.race.condition.action;

public class LongWrapper {
    private Object key = new Object();

    private long l;

    public long getL() {
        return l;
    }

    public LongWrapper(long l) {
        this.l = l;
    }

    public void incrementValue() {
        synchronized (key) {
            this.l = this.l+1;
        }
    }
}
