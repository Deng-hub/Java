package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/*
�˻��ĳ־ò�ӿ�
 */
public interface IAccountDao {
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
     * @param account
     */
    void updateAccount(Account account);

    /**
     * ɾ��
     * @param accountId
     */
    void deleteAccount(Integer accountId);
}
