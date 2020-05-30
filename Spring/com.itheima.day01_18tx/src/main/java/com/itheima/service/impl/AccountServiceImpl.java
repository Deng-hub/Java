package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
账户的业务层实现类
事务控制应该都是在业务层
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
            //2.2根据名称查询转入账户
            Account target=accountDao.findAccountByName(targetName);
            //3.转出账户减钱
            source.setMoney(source.getMoney()-money);
            System.out.println(source.getName()+source.getMoney());
            //4.转入账户加钱
            target.setMoney(target.getMoney()+money);
            System.out.println(target.getName()+target.getMoney());
            //5.更新转出账户
            accountDao.updateAccount(source);
            //6.更新转入账户
            int a=8/0;
            accountDao.updateAccount(target);

    }
}
