package com.wmw8;

public class Runnable1 implements Runnable {
    private int n;
    public void run() {
        int count = 0;
        for (int i = 0; i <n ; i++) {
            count += i;
        }
        System.out.println("n的阶乘为" + count);
    }
    public Runnable1(int n){
        this.n = n;
    }
}
