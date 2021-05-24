package com.wmw1.MyTime;

public class Main {
    public static void main(String[] args){
        MyTime mt = new MyTime();
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("输入小时");
        mt.setHour(s.nextInt());
        System.out.println("输入分钟");
        mt.setMinute(s.nextInt());
        System.out.println("输入秒钟");
        mt.setSecond(s.nextInt());
        System.out.println(mt.toString());
    }
}
