package com.itheima.utils;

import javax.sql.DataSource;
import java.sql.Connection;
/**
 * ���ӵĹ��ߣ������ڴ�����Դ�л�ȡһ�����ӣ�����ʵ�ֺ��̵߳İ�
 */
public class ConnectionUtils {
    private ThreadLocal<Connection> t1=new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * ��ȡ��ǰ�߳��ϵ�����
     */
    public Connection getThreadConnection(){
        //1.�ȴ�ThreadLocal�ϻ�ȡ
     try{
         Connection conn=t1.get();
         //2.�жϵ�ǰ�߳����Ƿ�������
         if(conn==null){
             //3.������Դ�л�ȡһ�����ӣ����Ҵ���ThreadLocal��
             conn=dataSource.getConnection();
             t1.set(conn);
         }
         //4.���ص�ǰ�߳��ϵ�����
         return conn;
     }
     catch (Exception e){
        throw new RuntimeException(e);
     }
    }

    /**
     * �����Ӻ��߳̽��
     */
    public void removeConnection(){
        t1.remove();
    }
}
