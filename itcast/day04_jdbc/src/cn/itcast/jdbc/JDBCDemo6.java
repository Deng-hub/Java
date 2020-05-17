package cn.itcast.jdbc;

import java.sql.*;

public class JDBCDemo6 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取链接对象
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "123");
            //3.定义sql
            String sql = "select * from account";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
             rs= stmt.executeQuery(sql);
            //6.处理结果
            //6.1让游标向下移动一行
            rs.next();
            //6.2获取数据
            int id=rs.getInt(1);
            String name=rs.getString("name");
            float money=rs.getFloat(3);
            System.out.println(id+"---"+name+"----"+money);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
