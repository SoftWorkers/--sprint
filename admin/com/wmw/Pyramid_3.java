package com.wmw;

import java.util.Scanner;

public class Pyramid_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金字塔层数：");
        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            if (i == 1) {
                for (int k = 1; k <= n - 1; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else if (i == n) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");
            }
        }
    }
}