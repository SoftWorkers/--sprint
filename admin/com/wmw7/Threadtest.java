package com.wmw7;

public class Threadtest implements Runnable{
    int num = 0;
    int time = 0;
    int te = 0;
    public Threadtest(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            te +=(++time);
            System.out.println("hello World\n"+te);
            if (time == num) {
                break;
            }
        }
    }
}
