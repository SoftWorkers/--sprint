package com.wmw4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        System.out.println("请输入内容：");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        FileWriter file = null;
        try {
            file = new FileWriter("E://aaa.txt");
            file.write(str);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
