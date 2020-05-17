package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
事务操作
 */
public class JDBCDemo10 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt1=null;
        PreparedStatement pstmt2=null;
        //1.获取链接
        try {
             conn=JDBCUtils.getConnection();
             //开启事务
            conn.setAutoCommit(false);
            //2.定义sql
            //2.1 zhangsan-500
            String sql1="update account set money=money-? where id=?";
            //2.2 lisi+500
            String sql2="update account set money=money+? where id=?";
            //3.获取执行sql对象
             pstmt1=conn.prepareStatement(sql1);
             pstmt2=conn.prepareStatement(sql2);
             //4.设置参数
            pstmt1.setFloat(1,100);
            pstmt1.setInt(2,1);

            pstmt2.setFloat(1,500);
            pstmt2.setInt(2,2);
            //5.执行sql
            pstmt1.executeUpdate();
            //手动制造异常
            int i=3/0;

            pstmt2.executeUpdate();
            //提交事务

        } catch (Exception e) {
            //事务回滚
            try {
                if(conn!=null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt1,conn);
            JDBCUtils.close(null,pstmt2,null);
        }
    }
}
