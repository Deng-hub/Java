package com.itheima.cast;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import config.JdbcConfig;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
ʹ��Junit��Ԫ���ԣ��������ǵ�����
Spring����junit��ֵ
    1.����spring����junit��jar(����)
    2.ʹ��Junit�ṩ��һ��ע���ԭ�е�main�����滻�ˣ��滻��spring�ṩ��
        @RunWith
    3.��֪spring��������,spring��ioc����ʱ����xml����ע��ģ�����˵��λ��
        @ContextConfiguration
            locations:ָ��xml�ļ���λ�ã�����classpath�ؼ���,��ʾ����·����
            classes:ָ��ע�������ڵ�λ��
������ʹ��spring5.x�汾��ʱ��Ҫ��junit��jar����ʱ4.12������
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfiguration.class)
public class AccountServiceTest {
    @Autowired
    private IAccountService as=null;

    @Test
    public void testFindAll() {
    //3.ִ�з���
        List<Account> accounts=as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne() {
         //3.ִ�з���
        Account account=as.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave() {
        Account account=new Account();
        account.setName("spring");
        account.setMoney(234f);
        //3.ִ�з���
        as.saveAccount(account);
    }
    @Test
    public void testUpdate() {
        //3.ִ�з���
        Account account=as.findAccountById(1);
        account.setMoney(236f);
        as.updateAccount(account);
    }
    @Test
    public void testDelete() {
     //3.ִ�з���
        as.deleteAccount(11);
    }

}
