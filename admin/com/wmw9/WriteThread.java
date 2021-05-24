package com.wmw9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 作者：wangmaokang
 * 日期: 2021/5/14 16:13
 * 描述:
 */
public class WriteThread extends  Thread {
    private Socket socket;

    @Override
    public void run() {
        try {
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            Scanner scanner=new Scanner(System.in);
            while (true){
                System.out.println("请输入您要对客户端说的话");
                String s=scanner.nextLine();

                if (isServerClose(socket)){
                    System.out.println("socket");
                    break;
                }

                dataOutputStream.write(s.getBytes());
                if (s.equals("拜拜")){
                    System.out.println("关闭服务");
                    socket.close();
                    break;

                }
            }
        }catch (Exception e){

        }

    }

    public WriteThread(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    /**
     * 判断是否断开连接，断开返回true,没有返回false
     * @param socket
     * @return
     */
    public static Boolean isServerClose(Socket socket){
        try{
            socket.sendUrgentData(0xFF);//发送1个字节的紧急数据，默认情况下，服务器端没有开启紧急数据处理，不影响正常通信
            return false;
        }catch(Exception se){
            return true;
        }
    }
}
