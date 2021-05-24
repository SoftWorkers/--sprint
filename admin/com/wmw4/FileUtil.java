package com.wmw4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        list = getListFromFile("E://abc.txt");
        System.out.println("文件追加：" + saveListToFile(list, "E://abc.txt", true));
        System.out.println("文件覆盖：" + saveListToFile(list, "E://abc.txt"));
        System.out.print("请输入追加的信息：");
        String message = input.next();
        System.out.println("追加成功：" + appendListToFile(message, "E://abc.txt"));
    }

    public static List<String> getListFromFile(String pathname) {
        List<String> list = new ArrayList<String>();
        try {
            FileInputStream file = new FileInputStream(pathname);
            byte[] bytes = new byte[1024];
            int len = 0;
            while(true) {
                len = file.read(bytes);
                if(len < 0) {
                    break;
                }
                String data = new String(bytes,"GBK");
                list.add(data);
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static boolean saveListToFile(List<String> list, String pathname, boolean append) {
        try {
            FileOutputStream output = new FileOutputStream(pathname);
            for (String str:list) {
                output.write(str.getBytes());
            }
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean saveListToFile(List<String> list, String pathname) {
        try {
            FileOutputStream output = new FileOutputStream(pathname);
            for (String str : list) {
                output.write(str.getBytes());
            }
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean appendListToFile(String message, String pathname) {
        try {
            FileOutputStream output = new FileOutputStream(pathname,true);
            output.write(message.getBytes());
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
