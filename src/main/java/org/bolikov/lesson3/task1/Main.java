package org.bolikov.lesson3.task1;

public class Main {
    static int count = 5;

    public boolean isPong;

    public synchronized void createPing() {
        while (isPong) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ping");
        isPong = true;
        notify();
    }

    public synchronized void createPong() {
        while (!isPong) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("pong");
        isPong = false;
        notify();
    }

    public static void main(String[] args) {
        Main main = new Main();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                main.createPing();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                main.createPong();
            }
        });

        t1.start();
        t2.start();
    }
}
