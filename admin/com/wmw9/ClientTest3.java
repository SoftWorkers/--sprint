package com.wmw9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class ClientTest3 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",2000);
            new WriteThread(socket).start();
            new ReadThread(socket).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
