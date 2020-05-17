package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
1.account表 添加一条记录
 */
public class JDBCDemo2 {

    public static void main(String[] args) {
        Statement stmt=null;
        Connection conn=null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        //2.定义sql
            String sql="insert into account(name,money) value('James',3000);";
        //3.获取Connection对象
            try {
                 conn=DriverManager.getConnection("jdbc:mysql:///eesy","root","123");
         //4.获取执行sql的对象Statement
                 stmt=conn.createStatement();
         //执行sql
                int count=stmt.executeUpdate(sql);//影响的行数
         //6.处理结果
                System.out.println(count);
                if(count>0){
                    System.out.println("添加成功!");
                }
                else {
                    System.out.println("添加失败!");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
         //stmt.close();
         //避免空指针异常
         //7.释放资源
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
