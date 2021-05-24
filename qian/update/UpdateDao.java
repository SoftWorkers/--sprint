package Eighth.update;

import Eighth.clock.Student;
import Eighth.login.DBconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UpdateDao {
    public static User login(Connection con, User user) throws Exception {
        User resultUser = new User();
        Statement statement = null;
        try {
            statement = con.createStatement();
            String sql = "insert into student(sno,name,major,loginAccount,passwd) values('" + user.getLoginAccount() + "','" + user.getUserName() + "','"+user.getDept()+"','"+user.getLoginAccount()+"','"+user.getPassWord()+"')";
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                java.lang.System.out.println("插入成功");
            } else {
                java.lang.System.out.println("插入失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultUser;
    }

    public List<Integer> SeeStud() {//查看学生用户信息
        List<Integer> std = new ArrayList<>();
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        ResultSet set = null;
        try {
            statement = connection.createStatement();
            String selectStr = " ";
            selectStr = "select * from student";
            set = statement.executeQuery(selectStr);

            while (set.next()) {
                std.add(set.getInt("sno"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("更新失败");
        } finally {
            if (set != null) {
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return std;

    }

}
