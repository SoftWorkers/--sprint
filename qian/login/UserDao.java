package Eighth.login;

import Eighth.login.User;

import java.sql.*;

import java.sql.PreparedStatement;

public class UserDao {
    public User login(Connection con, User user)throws Exception{
        User resultUser=null;
        String sql="select * from student where loginAccount=? and passwd=? ";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1,user.getLoginAccount());
        pst.setString(2, user.getPassWord());
        ResultSet rs=pst.executeQuery();
        if (rs.next()){
            resultUser=new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setLoginAccount(rs.getString("loginAccount"));
            resultUser.setPassWord(rs.getString("passwd"));
        }
        return resultUser;
    }

}
