package com.itheima.factory;

import com.itheima.service.impl.AccountServiceImpl;

/*
ģ��һ�������ࣨ��������Ǵ�����jar���еģ������޷�ͨ���޸�Դ��ķ�ʽ���ṩĬ�Ϲ�������

 */
public class InstanceFactory {
    public AccountServiceImpl getAccountService(){
        return new AccountServiceImpl();
    }
}
