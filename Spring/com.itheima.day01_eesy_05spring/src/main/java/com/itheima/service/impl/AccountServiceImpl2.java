package com.itheima.service.impl;

import com.itheima.service.IAccountService;

import java.util.Date;

/*
�˻���ҵ���ʵ����
 */
public class AccountServiceImpl2 implements IAccountService {
//����Ǿ����仯����������������ע��ķ�ʽ��
    private String name;
    private Integer age;
    private Date birthday;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount(){
         System.out.println("service�е�saveAccountִ����...."+name+","+age+","+birthday);
    }
}
