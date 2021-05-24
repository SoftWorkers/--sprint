package Eighth.rank;

import Eighth.login.DBconnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class rankchange {
    public void update(String number,String password) {
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String deleteStr = "update student set passwd="+password+" where loginAccount=" + number;
            int i = statement.executeUpdate(deleteStr);
            if (i > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
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
            if (connection != null) {
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
