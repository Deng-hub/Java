package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
�˻���ҵ���ʵ����
�������Ӧ�ö�����ҵ���
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService{

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao){
        this.accountDao=accountDao;
    }

    public Account findAccountById(Integer accountId) {
            return accountDao.findAccountById(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
            Account source=accountDao.findAccountByName(sourceName);
            //2.2�������Ʋ�ѯת���˻�
            Account target=accountDao.findAccountByName(targetName);
            //3.ת���˻���Ǯ
            source.setMoney(source.getMoney()-money);
            System.out.println(source.getName()+source.getMoney());
            //4.ת���˻���Ǯ
            target.setMoney(target.getMoney()+money);
            System.out.println(target.getName()+target.getMoney());
            //5.����ת���˻�
            accountDao.updateAccount(source);
            //6.����ת���˻�
            int a=8/0;
            accountDao.updateAccount(target);

    }
}
