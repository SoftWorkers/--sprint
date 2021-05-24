package com.wmw9;

import com.wmw9.ClientReadThread;
import com.wmw9.ClientWriteThread;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 作者：wangmaokang
 * 日期: 2021/5/14 15:15
 * 描述:
 */
public class ClientTest4 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("172.19.23.100",2000);
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入您的名字");

            String name=scanner.nextLine();
            new ClientWriteThread (socket,name).start();
            new ClientReadThread (socket,name).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
