package com.wmw8;

public class Main1 {
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1 (10);
        Runnable2 r2 = new Runnable2 ();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
