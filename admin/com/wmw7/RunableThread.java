package com.wmw7;
public class RunableThread implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"你好");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
