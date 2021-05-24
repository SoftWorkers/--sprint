package Eighth.clock;


import Eighth.login.DBconnection;
import Eighth.login.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class clockadd {
    int clockCount;
    public void update(String number) {
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


    public int colockDate(String name){
        List<Date> list=new ArrayList<>();
        int flag = 0;
        Connection connection=DBconnection.getConnection();// 获取连接
        Statement statement=null;
        ResultSet set=null;
        try {
            statement =connection.createStatement(); //通过连接获取 statement 对象
            String selectStr=" ";
            if (name!=null&&!name.equals("")){
                selectStr="select * from notes where sno like '%"+name+"%'";
            }
            set= statement.executeQuery(selectStr);
            while (set.next()){   //遍历 resultSet
                Notes dept=new Notes();
                dept.setTime(set.getDate("time"));
                list.add(dept.getTime());
            }
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String current =df.format(new Date());
            for (int i = 0; i < list.size(); i++) {
                if(current.equals(list.get(i).toString())){
                    flag = 1;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("更新失败");
        }finally {
            if (set!=null){
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement!=null){
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }

    public void clockInsert(String num,Student student) {
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        java.util.Date date = new java.util.Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        try {
            statement = connection.createStatement();
            String insertStr = "insert into notes(sno,name,time,count) values('" + student.getSno() + "','" + student.getName() + "','" +date1 + "','" + student.getCount() + "')";
            int i = statement.executeUpdate(insertStr);
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
            if (connection != null) {
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public Student FuzzySetstud(String  stuentName) {//模糊查询用户信息
        Student bs = new Student();
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        ResultSet set = null;

        try {
            statement = connection.createStatement();
            String selectStr = " ";
            if (stuentName!=null&&!stuentName.equals("") ) {
                selectStr = "select * from student where loginAccount like '%" + stuentName + "%'";
            }
            set = statement.executeQuery(selectStr);
            while(set.next()) {
                bs.setSno(set.getInt("sno"));
                bs.setName(set.getString("name"));
                bs.setCount(set.getInt("count"));
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

        return bs;
    }

}