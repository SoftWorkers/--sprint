package com.wmw5;

import java.sql.SQLException;

public class Text {
    public static void main(String[] args) {
        TeacherDao teacher = new TeacherDao ();
        //teacher.insert ( 1 ,"张三" ,10 ,"男" ,"1123444" ,"1123444@qq.com" ,3 );
        //teacher.insert ( 2 ,"李四" ,12 ,"男" ,"1133444" ,"1133444@qq.com" ,2 );
        //teacher.delete ( 2 );
        //teacher.update ( 1 ,"张三" ,20 ,"男" ,"1123444" ,"1123444@qq.com" ,3  );
        teacher.query("张三");
    }
}
