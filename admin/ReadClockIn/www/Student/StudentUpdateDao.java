package ReadClockIn.www.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentUpdateDao {
    //修改
    public static int update(Connection con , Student student) throws Exception {
        String updatesql = "update student set sno=?, name=?, major=?, grade=?, loginAccount=?, passwd=?, count=? where id=?";
        PreparedStatement pstmt = con.prepareStatement ( updatesql );
        pstmt.setString ( 1, student.getSno () );
        pstmt.setString ( 2, student.getName() );
        pstmt.setString ( 3, student.getMajor() );
        pstmt.setString ( 4, student.getGrade () );
        pstmt.setString ( 5, student.getLoginAccount () );
        pstmt.setString ( 6, student.getPasswd () );
        pstmt.setString ( 7, student.getCount () );
        pstmt.setInt ( 8, student.getId () );
        return pstmt.executeUpdate();
    }
}
