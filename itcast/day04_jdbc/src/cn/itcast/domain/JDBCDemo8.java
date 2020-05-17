package cn.itcast.domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
           定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBCDemo8 {
    public static void main(String[] args) throws SQLException {
        List<Account> list=new JDBCDemo8().findAll();
        System.out.println(list);
    }
    /*
    查询所有Account对象
     */
    public List<Account> findAll() throws SQLException {
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        List<Account> list=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取链接
             con=DriverManager.getConnection("jdbc:mysql:///eesy","root","123");
            //定义sql
            String sql="select * from account";
            //4.获取执行sql的对象
             stmt=con.createStatement();
            //5.执行sql
             rs=stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合\
            Account account=null;
             list=new ArrayList<>();
            while (rs.next()){
                //获取数据
                int id=rs.getInt("id");
                String name=rs.getString("name");
                float money=rs.getFloat("money");

                //创建对象,并赋值
                account=new Account();
                account.setId(id);
                account.setName(name);
                account.setMoney(money);
                //装载集合
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
