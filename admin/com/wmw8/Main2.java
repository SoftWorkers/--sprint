package com.wmw8;

public class Main2 {
    public static void main(String[] args) {
        WindowSell sell1 = new WindowSell ();
        WindowSell sell2 = new WindowSell ();
        WindowSell sell3 = new WindowSell ();
        WindowSell sell4 = new WindowSell ();

        Thread thread1 = new Thread ( sell1 );
        thread1.setName ( "窗口一" );
        Thread thread2 = new Thread ( sell1 );
        thread2.setName ( "窗口二" );
        Thread thread3 = new Thread ( sell1 );
        thread3.setName ( "窗口三" );
        Thread thread4 = new Thread ( sell1 );
        thread4.setName ( "窗口四" );

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
