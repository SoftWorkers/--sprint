package com.wmw9;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class ClientWriteThread extends  Thread {
    private Socket socket;
    private String ClientName;

    @Override
    public void run() {
        try {
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            Scanner scanner=new Scanner(System.in);
            while (true){
                System.out.println("请输入");
                String s=scanner.nextLine();

                if (isServerClose(socket)){
                    System.out.println("socket");
                    break;
                }
                s=getClientName()+":"+s;
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

    public ClientWriteThread(Socket socket, String ClientName) {
        this.socket = socket;
        this.ClientName = ClientName;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
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
