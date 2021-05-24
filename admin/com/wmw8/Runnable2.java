package com.wmw8;

public class Runnable2 implements Runnable {
    private int time = 0;
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            time++;
            System.out.println("come on"+" "+time);
            if (time == 20) {
                break;
            }
        }
    }
}
