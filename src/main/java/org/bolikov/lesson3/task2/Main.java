package org.bolikov.lesson3.task2;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int countRepeat = 20;

        Counter counter = new Counter();
        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 1000; i++) {
            CounterThread ct = new CounterThread(counter, lock, countRepeat);
            ct.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter:" + counter.getCounter());
    }

}
