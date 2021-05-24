package com.wmw1.Caculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Caculator sc = new Caculator ();
        Caculator.jisuan ();
        do {
            System.out.println ( "是否继续计算(y/n)" );
            Scanner scanner = new Scanner ( System.in );
            String c = scanner.nextLine ();
            if (c.equals ( "y" )) {
                Caculator.jisuan ();
            } else {
                return;
            }
        } while (true);
    }
}
