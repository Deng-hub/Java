package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * �˻���ҵ���ӿ�
 */
public interface IAccountService {
    /**
     * ��ѯ����
     * @return
     */
    List<Account> findAllAccount();

    /**
     * ��ѯһ��
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * ����
     * @param account
     */
    void saveAccount(Account account);

    /**
     * ����
     * @param accountId
     */
    void updateAccount(Account accountId);

    /**
     * ɾ��
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * ת��
     * @param sourceName  ת���˻�����
     * @param targetName  ת���˻�����
     * @param money       ת�˽��
     */
    void transfer(String sourceName,String targetName,Float money);
}
