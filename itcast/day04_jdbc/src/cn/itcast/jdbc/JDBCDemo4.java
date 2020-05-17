package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 3.account�� ɾ��һ����¼
 */
public class JDBCDemo4 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            //1.ע������
            Class.forName("com.mysql.jdbc.Driver");
            //2.��ȡ���Ӷ���
            conn = DriverManager.getConnection("jdbc:mysql:///eesy", "root", "123");
            //3.����sql
            String sql = "delete from account where id=3";
            //4.��ȡִ��sql����
            stmt = conn.createStatement();
            //5.ִ��sql
            int count = stmt.executeUpdate(sql);
            //6.������
            System.out.println(count);
            if (count > 0) {
                System.out.println("ɾ���ɹ���");
            } else {
                System.out.println("ɾ�� ʧ��!");
            }
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
        }
    }
}
