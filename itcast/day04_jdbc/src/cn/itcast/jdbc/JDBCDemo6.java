package cn.itcast.jdbc;

import java.sql.*;

public class JDBCDemo6 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs=null;
        try {
            //1.ע������
            Class.forName("com.mysql.jdbc.Driver");
            //2.��ȡ���Ӷ���
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "123");
            //3.����sql
            String sql = "select * from account";
            //4.��ȡִ��sql����
            stmt = conn.createStatement();
            //5.ִ��sql
             rs= stmt.executeQuery(sql);
            //6.������
            //6.1���α������ƶ�һ��
            rs.next();
            //6.2��ȡ����
            int id=rs.getInt(1);
            String name=rs.getString("name");
            float money=rs.getFloat(3);
            System.out.println(id+"---"+name+"----"+money);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7.�ͷ���Դ
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
