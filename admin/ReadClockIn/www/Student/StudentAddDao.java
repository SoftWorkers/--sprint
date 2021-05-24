package ReadClockIn.www.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentAddDao {
    public static int add(Connection con , Student student) throws Exception {
        String addsql = "insert into student values(null,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement ( addsql );
        pstmt.setString ( 1, student.getSno () );
        pstmt.setString ( 2, student.getName() );
        pstmt.setString ( 3, student.getMajor() );
        pstmt.setString ( 4, student.getGrade () );
        pstmt.setString ( 5, student.getLoginAccount () );
        pstmt.setString ( 6, student.getPasswd () );
        pstmt.setString ( 7, student.getCount () );
        return pstmt.executeUpdate();
    }
}
