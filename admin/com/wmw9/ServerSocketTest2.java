package com.wmw9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerSocketTest2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2000);//开发端口
            Socket socket = serverSocket.accept();//等待socket 连接
            System.out.println("有客户端对我进行了连接");
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            Scanner scanner=new Scanner(System.in);
            byte[] bytes=new byte[1024];
            while (true){
                //先发
                System.out.println("请输入您要对客户端说的话");
                String s=scanner.nextLine();
                dataOutputStream.write(s.getBytes());
                if (s.equals("拜拜")){
                    System.out.println("关闭服务");
                    socket.close();
                    break;

                }
               //等待接收
                int a=dataInputStream.read(bytes); //等待对方输入
                s=new String(bytes,0,a);
                System.out.println("对方说："+s);
                if (s.equals("拜拜")){
                    System.out.println("服务端已关闭");
                    socket.close();
                    break;
                }

            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
