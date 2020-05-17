package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
1.account�� ���һ����¼
 */
public class JDBCDemo2 {

    public static void main(String[] args) {
        Statement stmt=null;
        Connection conn=null;
        //1.ע������
        try {
            Class.forName("com.mysql.jdbc.Driver");
        //2.����sql
            String sql="insert into account(name,money) value('James',3000);";
        //3.��ȡConnection����
            try {
                 conn=DriverManager.getConnection("jdbc:mysql:///eesy","root","123");
         //4.��ȡִ��sql�Ķ���Statement
                 stmt=conn.createStatement();
         //ִ��sql
                int count=stmt.executeUpdate(sql);//Ӱ�������
         //6.������
                System.out.println(count);
                if(count>0){
                    System.out.println("��ӳɹ�!");
                }
                else {
                    System.out.println("���ʧ��!");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
         //stmt.close();
         //�����ָ���쳣
         //7.�ͷ���Դ
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
