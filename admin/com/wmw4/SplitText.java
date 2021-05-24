package com.wmw4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitText {
        public int i = 1;
        byte[] bytes = new byte[1048576];
        public Boolean Split(){
            try {
                FileInputStream input = new FileInputStream("E://work//used_car_testB_20200421.csv");
                while(true){
                    int len = input.read(bytes);
                    if(len < 0)
                        break;
                    System.out.println("第" + i + "次分割成功！");
                    FileOutputStream output = new FileOutputStream("E://work//" + (i++) );
                    output.write(bytes);
                    output.close();
                }
                input.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }

        public static void main(String[] args) {
            SplitText split = new SplitText ();
            System.out.println(split.Split());
        }
}
