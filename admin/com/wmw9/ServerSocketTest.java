package com.wmw9;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2000);//开发端口
            Socket socket = serverSocket.accept();//等待socket 连接
            System.out.println("有客户端对我进行了连接");
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            Scanner scanner=new Scanner(System.in);
            while (true){
                System.out.println("请输入您要对客户端说的话");
                String s=scanner.nextLine();
                dataOutputStream.write(s.getBytes());
                if (s.equals("拜拜")){
                    System.out.println("关闭服务");
                    socket.close();
                    break;

                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
