package com.wmw1.Caculator;
import java.util.Scanner;
public class Caculator {

    public Caculator() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double cut(double a, double b) {
        return a - b;
    }

    public static double cheng(double a, double b) {
        return a * b;
    }

    public static double chu(double a, double b) {
        return a / b;
    }

    public static void jisuan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        double a = sc.nextInt();
        System.out.println("输入第二个数：");
        double b = sc.nextInt();
        System.out.println("输入运算符：");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                Caculator.add(a,b);
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                Caculator.cut(a,b);
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                Caculator.cheng(a,b);
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                Caculator.chu ( a , b );
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            default:
                System.out.println("输入错误！");
        }
    }
}