package com.itheima.dao;

import com.itheima.domain.Account;

/**
 * �˻��ĳ־ò�ӿ�
 */
public interface IAccountDao {
    /**
     * ����id��ѯ�˻�
     * @param accountId
     * @return
     */
    Account findAccount(Integer accountId);

    /**
     * �������ֲ�ѯ�˻�
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);

    /**
     * �����˻�
     * @param account
     */
    void updateAccount(Account account);


}
