package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/*
�˻��ĳ־ò�ʵ����
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public void saveAccount(){
        System.out.println("�������˻�2");
    }
}
