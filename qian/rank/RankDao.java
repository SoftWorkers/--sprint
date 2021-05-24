package Eighth.rank;



import Eighth.login.User;
import com.mysql.cj.xdevapi.Collection;

import java.sql.*;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class RankDao {
    public String list(Connection con, User user, String number)throws Exception{
        User resultUser=null;
        String pp = null;
        String sql="select * from student where loginAccount="+number+"";
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        if (rs.next()){
            resultUser=new User();
            String pd=resultUser.setPassWord(rs.getString("passwd"));
            pp=pd;
        }
        return pp;
    }
}
