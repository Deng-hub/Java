package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
c3p0����ʾ
 */
public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.�������ݿ����ӳض���
        DataSource ds=new ComboPooledDataSource();
        //2.��ȡ���Ӷ���
        Connection conn=ds.getConnection();

        //3.��ӡ
        System.out.println(conn);
    }
}
