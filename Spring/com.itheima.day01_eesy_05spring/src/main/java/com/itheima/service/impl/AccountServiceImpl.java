package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;

/*
�˻���ҵ���ʵ����
 */
public class AccountServiceImpl implements IAccountService {
//����Ǿ����仯����������������ע��ķ�ʽ��
    private String name;
    private Integer age;
    private Date birthday;



    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount(){
         System.out.println("service�е�saveAccountִ����...."+name+","+age+","+birthday);
    }
}
