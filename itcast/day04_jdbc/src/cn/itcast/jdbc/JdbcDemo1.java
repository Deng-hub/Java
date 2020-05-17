package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
JDBC��������
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.��������jar��
        //2.ע������
        Class.forName("com.mysql.jdbc.Driver");
        //3.��ȡ���ݿ����Ӷ���
        //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","123");
        Connection conn=DriverManager.getConnection("jdbc:mysql:///eesy","root","123");
        //4.����sql���
        String sql="update account set money=10009 where id=1";
        //5.��ȡִ�еĶ���
        Statement stmt=conn.createStatement();
        //6.ִ��sql���
        int count=stmt.executeUpdate(sql);
        //7.������
        System.out.println(count);
        //8.�ͷ���Դ
        stmt.close();
        conn.close();
    }
}
