package cn.itcast.datasource.druid;

import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
ʹ���µĹ�����
 */
public class DruidDemo2 {
    public static void main(String[] args) {
       Connection conn=null;
        PreparedStatement pstmt=null;
        /*
        ���һ����ӵĲ���,��account���һ����¼
         */
        //1.��ȡ����
        try {
            conn= JDBCUtils.getConnection();
            //2.����sql
            String sql="insert into account values(null,?,?)";
            //3.��ȡpstmt����
             pstmt=conn.prepareStatement(sql);
            //4.���ʺŸ�ֵ
            pstmt.setString(1,"Dog");
            pstmt.setFloat(2,3000);
            //5.ִ��sql
            int count=pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //6.�ͷ���Դ
        JDBCUtils.close(pstmt,conn);
        }
    }
}
