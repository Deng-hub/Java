package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.*;
import java.util.Collection;
import java.util.Scanner;

/*
 *����
        1.ͨ������¼���û���������
        2.�ж��û��Ƿ��¼�ɹ�
 */
public class JDBCDemo9 {
    public static void main(String[] args) {
        //1.����¼��
        Scanner sc=new Scanner(System.in);
        System.out.println("please input username");
        String username=sc.nextLine();
        System.out.println("please input password");
        String password=sc.nextLine();
        //2.���÷���
            boolean flag=new JDBCDemo9().login2(username,password);
        //3.�жϽ���������ͬ���
        if(flag){
            System.out.println("��¼�ɹ���");
        }
        else {
            System.out.println("��½ʧ�ܣ��û������������");
        }
    }
    /*
    ��¼����
     */
    public boolean login(String username,String password){
        if(username==null||password==null){
            return false;
        }
        //�������ݿ��Ƿ��¼�ɹ�
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        //1.��ȡ����
        try {
             conn = JDBCUtils.getConnection();
            //2.����sql
            String sql = "select * from user where username='" + username + "' and password='" + password + "'";
            //3.��ȡִ��sql�Ķ���
             stmt = conn.createStatement();
            //4.ִ�в�ѯ
             rs = stmt.executeQuery(sql);
            //5.�ж�
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return false;
    }

    /*
  ��¼������ʹ��PreparedStatementʵ��
   */
    public boolean login2(String username,String password){
        if(username==null||password==null){
            return false;
        }
        //�������ݿ��Ƿ��¼�ɹ�
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        //1.��ȡ����
        try {
            conn = JDBCUtils.getConnection();
            //2.����sql
            String sql = "select * from user where username=? and password=?";
            //3.��ȡִ��sql�Ķ���
            pstmt=conn.prepareStatement(sql);
            //��?��ֵ
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.ִ�в�ѯ,����Ҫ����sql
            rs = pstmt.executeQuery();
            //5.�ж�
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
        return false;
    }
}
