package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
账户的业务层实现类
事务控制应该都是在业务层
 */
@Service("accountService")
public class AccountServiceImpl_OLD implements IAccountService{
    @Autowired
    private IAccountDao accountDao;
    private TransactionManager txManager;

    public void setTxManager(TransactionManager txManaager) {
        this.txManager = txManaager;
    }

    public List<Account> findAllAccount() {
        try{
            //1.开启事务
            txManager.beginTransanction();
            //2.执行操作
            List<Account> accounts=accountDao.findAllAccount();
            //3.提交事务
            txManager.commit();
            //4.返回结果
            return accounts;
        }
        catch (Exception e){
            //回滚事务
            txManager.rollback();
        }finally {
            //释放连接
            txManager.release();
            throw new RuntimeException();
        }
    }

    public Account findAccountById(Integer accountId) {
        try{
            //1.开启事务
            txManager.beginTransanction();
            //2.执行操作
            Account account=accountDao.findAccountById(accountId);
            //3.提交事务
            txManager.commit();
            //4.返回结果
            return account;
        }
        catch (Exception e){
            //回滚事务
            txManager.rollback();
        }finally {
            //释放连接
            txManager.release();
            throw new RuntimeException();
        }
    }

    public void saveAccount(Account account) {
        try{
            //1.开启事务
            txManager.beginTransanction();
            //2.执行操作
            accountDao.saveAccount(account);
            //3.提交事务
            txManager.commit();
        }
        catch (Exception e){
            //回滚事务
            txManager.rollback();
        }finally {
            //释放连接
            txManager.release();
        }
    }

    public void updateAccount(Account account) {
        try{
            //1.开启事务
            txManager.beginTransanction();
            //2.执行操作
            accountDao.updateAccount(account);
            //3.提交事务
            txManager.commit();
        }
        catch (Exception e){
            //回滚事务
            txManager.rollback();
        }finally {
            //释放连接
            txManager.release();
        }

    }

    public void deleteAccount(Integer accountId) {
        try{
            //1.开启事务
            txManager.beginTransanction();
            //2.执行操作
            accountDao.deleteAccount(accountId);            //3.提交事务
            txManager.commit();
        }
        catch (Exception e){
            //回滚事务
            txManager.rollback();
        }finally {
            //释放连接
            txManager.release();
        }

    }

    public void transfer(String sourceName,String targetName,Float money) {
        try{
            //1.开启事务
            txManager.beginTransanction();
            //2.执行操作
            //2.1根据名称查询转出账户
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
            accountDao.updateAccount(target);
            //3.提交事务
            txManager.commit();
        }
        catch (Exception e){
            //回滚事务
            txManager.rollback();
        }finally {
            //释放连接
            txManager.release();
        }
    }
}
