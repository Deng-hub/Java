package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
�˻���ҵ���ʵ����
�������Ӧ�ö�����ҵ���
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService{
    @Autowired
    private IAccountDao accountDao;
    private TransactionManager txManager;

    public void setTxManager(TransactionManager txManaager) {
        this.txManager = txManaager;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
    public Account findAccountById(Integer accountId) {
       return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
            accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {

            accountDao.updateAccount(account);
            //3.�ύ����
            txManager.commit();
    }

    public void deleteAccount(Integer accountId) {

            accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName,String targetName,Float money) {
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
