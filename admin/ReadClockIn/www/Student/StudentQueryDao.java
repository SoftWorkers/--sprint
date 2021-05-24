package ReadClockIn.www.Student;

import ReadClockIn.www.Others.StringUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentQueryDao {
    //模糊查询
    public static ResultSet list(Connection con , Student student) throws Exception {
        StringBuffer sb = new StringBuffer ( "select * from student" );
        if (StringUtil.isNotEmpty ( String.valueOf ( student.getSno() ) )) {
            sb.append ( " and sno like '%"+student.getSno ()+"%'" );
        }
        PreparedStatement pstmt = con.prepareStatement ( sb.toString ().replaceFirst ( "and", "where" ) );
        return pstmt.executeQuery();
    }
}
