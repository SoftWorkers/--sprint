package com.wmw8;

public class Thread1 extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println(currentThread().getName()+1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
