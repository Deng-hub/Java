package com.itheima.cast;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*
ʹ��Junit��Ԫ���ԣ��������ǵ�����
 */
public class AccountServiceTest {
    @Test
    public void testFindAll() {
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.�õ�ҵ������
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //3.ִ�з���
        List<Account> accounts=as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne() {
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.�õ�ҵ������
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //3.ִ�з���
        Account account=as.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void testSave() {
        Account account=new Account();
        account.setName("spring");
        account.setMoney(234f);
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.�õ�ҵ������
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //3.ִ�з���
        as.saveAccount(account);
    }
    @Test
    public void testUpdate() {
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.�õ�ҵ������
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //3.ִ�з���
        Account account=as.findAccountById(4);
        account.setMoney(236f);
        as.updateAccount(account);
    }
    @Test
    public void testDelete() {
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.�õ�ҵ������
        IAccountService as=ac.getBean("accountService",IAccountService.class);
        //3.ִ�з���
        as.deleteAccount(4);
    }

}
