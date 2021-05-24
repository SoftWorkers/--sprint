package com.wmw7;

public class MainTest {
    public static void main(String[] args) {
        //Threadtest threadtest = new Threadtest(10);
        //Thread t = new Thread (threadtest);
        //t.start();

        //RunableThread runableThread=new RunableThread();
        //Thread thread=new Thread(runableThread);
        //thread.start();

        //Cat cat = new Cat();
        //cat.start();

    WindowShell shell1 = new WindowShell ();
    WindowShell shell2 = new WindowShell ();
    WindowShell shell3 = new WindowShell ();

    Thread thread1 = new Thread ( shell1 );
    thread1.setName ( "窗口一" );

    Thread thread2 = new Thread ( shell2 );
    thread2.setName ( "窗口二" );

    Thread thread3 = new Thread ( shell3 );
    thread3.setName ( "窗口三" );

    thread1.start ();
    thread2.start ();
    thread3.start ();
    }
}
