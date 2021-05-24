package Eighth.User;

import Eighth.login.User;

import java.awt.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class UIDao {
    public List list(Connection con, User user,String num)throws Exception{
        User resultUser=null;
        List<String> list = new ArrayList<String>();
        String sql="select * from student where loginAccount="+num+"";
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        if (rs.next()){
            resultUser=new User();
            String num1=resultUser.setLoginAccount(rs.getString("loginAccount"));
            String name=resultUser.setUserName(rs.getString("name"));
            String major=resultUser.setMajor(rs.getString("major"));
            list.add(num1);
            list.add(name);
            list.add(major);
        }
        return list;
    }
}
