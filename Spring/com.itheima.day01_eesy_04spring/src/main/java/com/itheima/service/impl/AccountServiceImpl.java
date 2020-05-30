package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.w3c.dom.ls.LSOutput;

/*
账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }
     public void saveAccount(){
         System.out.println("service中的saveAccount执行了....");
    }
    public void init(){
        System.out.println("对象初始化了...");
    }
    public void destroy(){
        System.out.println("对象销毁了...");
    }

}
