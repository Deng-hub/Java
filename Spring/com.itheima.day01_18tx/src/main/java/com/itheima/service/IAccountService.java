package com.itheima.service;

import com.itheima.domain.Account;

/**
 * 账户的业务层接口
 */
public interface IAccountService {
    /**
     * 根据id查询账户信息
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 转账
     * @param sourceName   转出账户名
     * @param targetName    转入账户名
     * @param money           转入金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
