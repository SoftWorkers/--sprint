package com.wmw8;

public class WindowSell implements Runnable{
    @Override
    public void run(){
        while (true){
            if (Ticket.ticketNum > 0) {
                sellTicket();
            } else {
                break;
            }
        }
    }
    public synchronized  static void sellTicket(){  //同步方法 没有加 static 锁是this， 如果有加static 锁 class
        if (Ticket.ticketNum <=0){
            return;
        }
        System.out.println(Thread.currentThread().getName() + "当前卖出第" + Ticket.ticketNum + "张票");
        Ticket.ticketNum--;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
