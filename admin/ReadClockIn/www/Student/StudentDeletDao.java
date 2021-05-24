package ReadClockIn.www.Student;

import ReadClockIn.www.Administrator.Administrator;
import ReadClockIn.www.Notes.Notes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDeletDao {
    public static int delet(Connection con , Student student) throws Exception {
        String deletsql = "delete from student where sno=?";
        PreparedStatement pstmt = con.prepareStatement ( deletsql );
        pstmt.setString ( 1, student.getSno () );
        return pstmt.executeUpdate();
    }
}
