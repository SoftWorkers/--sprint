package com.wmw10;

import java.io.DataInputStream;
import java.net.Socket;

public class ReadThread extends  Thread {
    private Socket socket;

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
                System.out.println("对方说"+s);
                if (s.equals("再见")){
                    System.out.println("Server已关闭");
                    socket.close();
                    break;
                }
            }
        }catch (Exception e){

        }

    }

    public ReadThread(Socket socket) {
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
