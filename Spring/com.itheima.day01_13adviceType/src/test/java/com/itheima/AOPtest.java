package com.itheima;

import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����AOP������
 */
public class AOPtest {
    public static void main(String[] args) {
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.��ȡ����
        IAccountService as=(IAccountService)ac.getBean("accountService");
        //3.ִ�з���
        as.saveAccount();
;
    }
}
