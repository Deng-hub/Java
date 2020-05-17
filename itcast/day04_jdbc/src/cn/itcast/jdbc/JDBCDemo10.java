package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
�������
 */
public class JDBCDemo10 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt1=null;
        PreparedStatement pstmt2=null;
        //1.��ȡ����
        try {
             conn=JDBCUtils.getConnection();
             //��������
            conn.setAutoCommit(false);
            //2.����sql
            //2.1 zhangsan-500
            String sql1="update account set money=money-? where id=?";
            //2.2 lisi+500
            String sql2="update account set money=money+? where id=?";
            //3.��ȡִ��sql����
             pstmt1=conn.prepareStatement(sql1);
             pstmt2=conn.prepareStatement(sql2);
             //4.���ò���
            pstmt1.setFloat(1,100);
            pstmt1.setInt(2,1);

            pstmt2.setFloat(1,500);
            pstmt2.setInt(2,2);
            //5.ִ��sql
            pstmt1.executeUpdate();
            //�ֶ������쳣
            int i=3/0;

            pstmt2.executeUpdate();
            //�ύ����

        } catch (Exception e) {
            //����ع�
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
