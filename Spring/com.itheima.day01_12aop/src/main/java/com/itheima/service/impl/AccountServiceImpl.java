package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * 账户的实现类
 */
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新");
    }

    public void deleteAccount() {
        System.out.println( "执行了删除");
    }
}
