package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.w3c.dom.ls.LSOutput;

/*
�˻���ҵ���ʵ����
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao=new AccountDaoImpl();
    public AccountServiceImpl(){
        System.out.println("���󴴽���");
    }
     public void saveAccount(){
       accountDao.saveAccount();
    }

}
