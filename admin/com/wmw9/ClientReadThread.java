package com.wmw9;

import java.io.DataInputStream;
import java.net.Socket;

/**
 * 作者：wangmaokang
 * 日期: 2021/5/14 16:13
 * 描述:
 */
public class ClientReadThread extends  Thread {
    private Socket socket;
    private String ClientName;
    @Override
    public void run() {
        try {
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            byte[] bytes=new byte[1024];
            while (true){

                if (isServerClose(socket)){
                    break;
                }
                int a=dataInputStream.read(bytes); //等待对方输入
                String s=new String(bytes,0,a);
                String ss=s.substring(0,s.indexOf(":"));
                if (!ss.equals(ClientName)){
                    System.out.println(s);
                }

            }
        }catch (Exception e){

        }

    }

    public ClientReadThread(Socket socket, String clientName) {
        this.socket = socket;
        ClientName = clientName;
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
