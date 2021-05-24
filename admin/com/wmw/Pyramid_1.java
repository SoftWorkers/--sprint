package com.wmw;

import java.util.Scanner;

public class Pyramid_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金字塔层数：");
        int n = input.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
