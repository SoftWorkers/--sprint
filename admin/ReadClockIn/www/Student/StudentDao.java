package ReadClockIn.www.Student;

import ReadClockIn.www.Others.DBconnection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class StudentDao {


    public void Revise (String number){
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String deleteStr = "update student set count=count+1 where loginAccount=" + number;
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
