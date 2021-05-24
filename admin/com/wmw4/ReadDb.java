package com.wmw4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ReadDb {
    public static void main(String[] args) {
        List<String> list = getListFromFile("E://db.properties");
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static List<String> getListFromFile(String pname) {
        List<String> list = new ArrayList<> ();
        Properties pro = new Properties();
        FileReader reader = null;
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("E://db.properties"));
            pro.load(buffer);
            Set<String> set = pro.stringPropertyNames();
            for (String key:set) {
                System.out.println(key + ":" + pro.getProperty(key));
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
