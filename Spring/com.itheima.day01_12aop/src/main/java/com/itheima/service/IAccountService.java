package com.itheima.service;

/**
 * 业务层接口
 */
public interface IAccountService {
    /**
     * 保存账户
     */
     void saveAccount();

    /**
     * 模拟更新账户
     */
    void updateAccount(int i);

    /**
     * 删除账户
     */
    void deleteAccount();
}
