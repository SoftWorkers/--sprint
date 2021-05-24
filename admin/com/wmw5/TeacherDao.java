package com.wmw5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao {
    //插入数据库
    public void insert(int id, String name, int age, String gender, String phone, String mail, int dept_id) {
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        String sql = "insert into teacher(id,name,age,gender,phone,mail,dept_id) values('" + id + "','" + name + "','" + age + "','" + gender + "','" + phone + "','" + mail + "','" + dept_id + "')";
        try {
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            if (i > 0){
                System.out.println("插入成功");
            }else {
                System.out.println("插入失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                try {
                    statement.close ();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
            if (connection != null) {
                try {
                    connection.close (); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
    //删除数据库
    public void delete(int id) {
        Connection connection = DBconnection.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "delete from teacher where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt (1,id);
            int i = statement.executeUpdate();
            if (i > 0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                try {
                    statement.close ();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
            if (connection != null) {
                try {
                    connection.close (); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
    //更改数据库
    public void update(int id, String name, int age, String gender, String phone, String mail, int dept_id) {
        Connection connection = DBconnection.getConnection ();
        Statement statement = null;
        String sql = "update teacher set name='" + name + "',age='" + age + "',gender='" + gender + "',phone='" + phone + "',mail='" + mail + "',dept_id='" + dept_id + "'where id=" + id;
        try {
            statement = connection.createStatement ();
            int i = statement.executeUpdate ( sql );
            if (i > 0) {
                System.out.println ( "修改成功" );
            } else {
                System.out.println ( "修改失败" );
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            if (statement != null) {
                try {
                    statement.close ();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
            if (connection != null) {
                try {
                    connection.close (); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
    //查询数据库
    public List<teacher> query(String name) {
        List<teacher> t = new ArrayList<>();
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        ResultSet set = null;
        try {
            statement = connection.createStatement();
            String sql = " ";
            if (name != null && !name.equals("") ) {
                sql = "select * from teacher where name like '%" + name + "%'";
            }  else {
                sql = "select * from teacher";
            }
            set = statement.executeQuery(sql);
            while (set.next()) {
                teacher t1 = new teacher();
                t1.setId(set.getInt("id"));
                t1.setName(set.getString("name"));
                t.add(t1);
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

        return t;

    }
}

