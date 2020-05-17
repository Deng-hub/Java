package cn.itcast.datasource.druid;

import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
使用新的工具类
 */
public class DruidDemo2 {
    public static void main(String[] args) {
       Connection conn=null;
        PreparedStatement pstmt=null;
        /*
        完成一个添加的操作,给account添加一条记录
         */
        //1.获取连接
        try {
            conn= JDBCUtils.getConnection();
            //2.定义sql
            String sql="insert into account values(null,?,?)";
            //3.获取pstmt对象
             pstmt=conn.prepareStatement(sql);
            //4.给问号赋值
            pstmt.setString(1,"Dog");
            pstmt.setFloat(2,3000);
            //5.执行sql
            int count=pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //6.释放资源
        JDBCUtils.close(pstmt,conn);
        }
    }
}
