package com.itheima.service.impl;

import com.itheima.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * �˻���ʵ����
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("ִ���˱���");
        //int i=1/0;
    }

    public void updateAccount(int i) {
        System.out.println("ִ���˸���");
    }

    public void deleteAccount() {
        System.out.println( "ִ����ɾ��");
    }
}
p