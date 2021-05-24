package com.wmw9;

import javax.sound.midi.Soundbank;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",2000);
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            byte[] bytes=new byte[1024];
            while (true){
                int a=dataInputStream.read(bytes); //等待对方输入
                String s=new String(bytes,0,a);
                System.out.println("对方说"+s);
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
