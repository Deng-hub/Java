package com.itheima.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo2 {
    public static void main(String[] args) {

        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.��ȡ����
        JdbcTemplate jt=ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //3.ִ�в���
        jt.execute("insert into account(name,money) values('fff',1000)");

       /*
        //׼������Դ,spring����������Դ
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/eesy");
        ds.setUsername("root");
        ds.setPassword("123");
        //1.����JdbcTemplate����
        JdbcTemplate jt=new JdbcTemplate();
        //��jt��������Դ
        jt.setDataSource(ds);
        //2.ִ�в���
        jt.execute("insert into account(name,money) values('ccc',1000)");
        */
    }
}
