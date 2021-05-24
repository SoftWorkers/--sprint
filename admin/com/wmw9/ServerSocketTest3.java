package com.wmw9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2000);//开发端口
            Socket socket = serverSocket.accept();//等待socket 连接
            System.out.println("有客户端对我进行了连接");
            new WriteThread(socket).start();
            new ReadThread(socket).start();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
