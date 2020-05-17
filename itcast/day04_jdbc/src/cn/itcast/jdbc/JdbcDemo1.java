package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
JDBC快速入门
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库链接对象
        //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","123");
        Connection conn=DriverManager.getConnection("jdbc:mysql:///eesy","root","123");
        //4.定义sql语句
        String sql="update account set money=10009 where id=1";
        //5.获取执行的对象
        Statement stmt=conn.createStatement();
        //6.执行sql语句
        int count=stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
