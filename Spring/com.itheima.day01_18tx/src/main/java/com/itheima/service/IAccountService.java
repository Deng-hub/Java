package com.itheima.service;

import com.itheima.domain.Account;

/**
 * �˻���ҵ���ӿ�
 */
public interface IAccountService {
    /**
     * ����id��ѯ�˻���Ϣ
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * ת��
     * @param sourceName   ת���˻���
     * @param targetName    ת���˻���
     * @param money           ת����
     */
    void transfer(String sourceName,String targetName,Float money);
}
