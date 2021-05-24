package com.wmw1.MyDate;

public class Main {
    public static void main(String[] args){
        MyDate mt = new MyDate();
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("输入年");
        mt.setYear(s.nextInt());
        System.out.println("输入月");
        mt.setMouth(s.nextInt());
        System.out.println("输入日");
        mt.setDay(s.nextInt());
        System.out.println(mt.toString());
    }
}
