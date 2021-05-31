package org.bolikov.lesson3.task2;

import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {
    private Counter counter;
    private ReentrantLock lock;
    private int repeat;

    public CounterThread(Counter counter, ReentrantLock lock, int repeat) {
        this.counter = counter;
        this.lock = lock;
        this.repeat = repeat;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < repeat; i++) {
            counter.addCounter();
        }
        lock.unlock();
    }
}
