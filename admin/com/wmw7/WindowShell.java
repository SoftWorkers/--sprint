package com.wmw7;

import com.wmw1.Animal.Animal;

public class WindowShell implements Runnable{
    public static Animal animal = new Animal () {
        @Override
        public void info() {

        }
    };
    public void run() {
        while (true) {
            //synchronized (animal){
                if (Ticket.ticketNum > 0) {
                    String ticketNum;
                    System.out.println ( Thread.currentThread ().getName () + "当前卖出第" + Ticket.ticketNum );
                    Ticket.ticketNum--;
                }else{
                    break;
                }
            }
            try {
                Thread.sleep ( 200 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        public synchronized static void sellTicket(){
            if (Ticket.ticketNum <= 0){
               return;
            }
            System.out.println (  Thread.currentThread ().getName () + "当前卖出第" + Ticket.ticketNum );
            Ticket.ticketNum--;
        }

}
