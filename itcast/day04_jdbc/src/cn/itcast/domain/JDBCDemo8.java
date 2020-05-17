package cn.itcast.domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
           ����һ����������ѯemp������ݽ����װΪ����Ȼ��װ�ؼ��ϣ����ء�
 */
public class JDBCDemo8 {
    public static void main(String[] args) throws SQLException {
        List<Account> list=new JDBCDemo8().findAll();
        System.out.println(list);
    }
    /*
    ��ѯ����Account����
     */
    public List<Account> findAll() throws SQLException {
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        List<Account> list=null;
        try {
            //1.ע������
            Class.forName("com.mysql.jdbc.Driver");
            //��ȡ����
             con=DriverManager.getConnection("jdbc:mysql:///eesy","root","123");
            //����sql
            String sql="select * from account";
            //4.��ȡִ��sql�Ķ���
             stmt=con.createStatement();
            //5.ִ��sql
             rs=stmt.executeQuery(sql);
            //6.�������������װ����װ�ؼ���\
            Account account=null;
             list=new ArrayList<>();
            while (rs.next()){
                //��ȡ����
                int id=rs.getInt("id");
                String name=rs.getString("name");
                float money=rs.getFloat("money");

                //��������,����ֵ
                account=new Account();
                account.setId(id);
                account.setName(name);
                account.setMoney(money);
                //װ�ؼ���
                list.add(account);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (con!=null){
                con.close();
            }
            if (stmt!=null){
                stmt.close();
            }
            if (rs!=null){
                rs.close();
            }
        }
        return list;
    }
}
