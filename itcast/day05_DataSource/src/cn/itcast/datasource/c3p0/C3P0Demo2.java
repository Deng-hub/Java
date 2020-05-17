package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

/*
c3p0��ʾ
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
//        //1.��ȡDataSource.ʹ��Ĭ������
//        DataSource ds=new ComboPooledDataSource();
//        for(int i=1;i<=11;i++){
//            Connection conn=ds.getConnection();
//            System.out.println(i+"!"+conn);
//            if(i==5){
//                conn.close();//�黹���ӵ����ӳ���
//            }
//        }
        testNamedConfig();
    }
    public static void testNamedConfig() throws SQLException {
        //1.1��ȡDataSource.ʹ��ָ����������
        DataSource ds=new ComboPooledDataSource("otherc3p0");

        //2.��ȡ����
        for(int i=1;i<=8;i++){
            Connection conn=ds.getConnection();
            System.out.println(i+"!"+conn);
        }
    }
}
