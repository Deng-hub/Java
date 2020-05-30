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
public class AccountServiceImpl_OLD implements IAccountService{
    @Autowired
    private IAccountDao accountDao;
    private TransactionManager txManager;

    public void setTxManager(TransactionManager txManaager) {
        this.txManager = txManaager;
    }

    public List<Account> findAllAccount() {
        try{
            //1.��������
            txManager.beginTransanction();
            //2.ִ�в���
            List<Account> accounts=accountDao.findAllAccount();
            //3.�ύ����
            txManager.commit();
            //4.���ؽ��
            return accounts;
        }
        catch (Exception e){
            //�ع�����
            txManager.rollback();
        }finally {
            //�ͷ�����
            txManager.release();
            throw new RuntimeException();
        }
    }

    public Account findAccountById(Integer accountId) {
        try{
            //1.��������
            txManager.beginTransanction();
            //2.ִ�в���
            Account account=accountDao.findAccountById(accountId);
            //3.�ύ����
            txManager.commit();
            //4.���ؽ��
            return account;
        }
        catch (Exception e){
            //�ع�����
            txManager.rollback();
        }finally {
            //�ͷ�����
            txManager.release();
            throw new RuntimeException();
        }
    }

    public void saveAccount(Account account) {
        try{
            //1.��������
            txManager.beginTransanction();
            //2.ִ�в���
            accountDao.saveAccount(account);
            //3.�ύ����
            txManager.commit();
        }
        catch (Exception e){
            //�ع�����
            txManager.rollback();
        }finally {
            //�ͷ�����
            txManager.release();
        }
    }

    public void updateAccount(Account account) {
        try{
            //1.��������
            txManager.beginTransanction();
            //2.ִ�в���
            accountDao.updateAccount(account);
            //3.�ύ����
            txManager.commit();
        }
        catch (Exception e){
            //�ع�����
            txManager.rollback();
        }finally {
            //�ͷ�����
            txManager.release();
        }

    }

    public void deleteAccount(Integer accountId) {
        try{
            //1.��������
            txManager.beginTransanction();
            //2.ִ�в���
            accountDao.deleteAccount(accountId);            //3.�ύ����
            txManager.commit();
        }
        catch (Exception e){
            //�ع�����
            txManager.rollback();
        }finally {
            //�ͷ�����
            txManager.release();
        }

    }

    public void transfer(String sourceName,String targetName,Float money) {
        try{
            //1.��������
            txManager.beginTransanction();
            //2.ִ�в���
            //2.1�������Ʋ�ѯת���˻�
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
            accountDao.updateAccount(target);
            //3.�ύ����
            txManager.commit();
        }
        catch (Exception e){
            //�ع�����
            txManager.rollback();
        }finally {
            //�ͷ�����
            txManager.release();
        }
    }
}
