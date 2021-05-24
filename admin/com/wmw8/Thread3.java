package com.wmw8;

import sun.misc.Lock;

public class Thread3 {
    public static Lock lock = new Lock();
    private static int number = 0;
    public static class ThreadA extends Thread {
        public void run() {
            for (int i = 1; i <= 50; ) {
                try {
                    lock.lock();
                    while (number % 2 == 1) {
                        System.out.println("ThreadA:" + number );
                        i++;
                        number++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class ThreadB extends Thread {
        public void run() {
            for (int i = 1; i <= 50; ) {
                try {
                    lock.lock();
                    while (number % 2 == 0) {
                        System.out.println("ThreadB:" + number );
                        i++;
                        number++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
