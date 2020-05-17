package cn.itcast.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
JDBC������
 */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /*
    �ļ��Ķ�ȡ��ֻ��Ҫ��ȡһ�μ����õ���Щֵ,ʹ�þ�̬�����
     */
    static {
        //��ȡ��Դ�ļ�����ȡֵ
        try {
            //1.����Properties������
            Properties pro=new Properties();

            //��ȡsrc·���µ��ļ��ķ�ʽ--->ClassLoader �������
            ClassLoader classLoader=JDBCUtils.class.getClassLoader();
            URL res=classLoader.getResource("jdbc.properties");
            String path=res.getPath();
            System.out.println(path);
            //2.�����ļ�
            pro.load(new FileReader(path));
            //3.��ȡ���ݣ���ֵ
            url=pro.getProperty("url");
            user=pro.getProperty("user");
            password=pro.getProperty("password");
            driver=pro.getProperty("driver");
            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    ��ȡ����
    @return ���Ӷ���
     */
    public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url,user,password);
    }

    /*
    �ͷ���Դ
    @param stmt
    @param conn
     */
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){

                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}
