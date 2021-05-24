package com.wmw7;

public class Cat extends Thread {
    private int time = 0;
    public void run() {
        while (true) {
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            time ++;
            System.out.println(currentThread().getName()+"hello World"+time);
            if (time == 10) {
                break;
            }
        }
    }
}
