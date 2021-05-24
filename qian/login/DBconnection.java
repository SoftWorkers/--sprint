package Eighth.login;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static String url="jdbc:mysql://localhost:3306/readbook?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static String userName="root";
    private static String passWord="123456";
    private static String driverName="com.mysql.jdbc.Driver";
    public static Connection getConnection() {
        Connection connection=null;
        try {
            connection=DriverManager.getConnection(url,userName,passWord);
            System.out.println("Success");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("error");
        }
        return connection;
    }
    static {
        try {
            Class.forName(driverName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
