package com.wmw;

import java.util.Scanner;

public class  Diamond_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入菱形层数：");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=1;i<=n-1;i++) {
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=2*n-3;k>=2*i-1;k--){
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }

}
