package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.w3c.dom.ls.LSOutput;

/*
�˻���ҵ���ʵ����
 */
public class AccountServiceImpl implements IAccountService {
    public AccountServiceImpl(){
        System.out.println("���󴴽���");
    }
     public void saveAccount(){
         System.out.println("service�е�saveAccountִ����....");
    }
    public void init(){
        System.out.println("�����ʼ����...");
    }
    public void destroy(){
        System.out.println("����������...");
    }

}
