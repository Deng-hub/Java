package com.itheima.cglib;

import com.itheima.proxy.IProducer;

/**
 * һ��������
 */
public class Producer implements IProducer{
    /**
     * ����
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("���۲�Ʒ�����õ�Ǯ"+money);
    }

    /**
     * �ۺ�
     * @param money
     */
    public void afterService(float money){
        System.out.println("�ṩ�ۺ���񣬲��õ�Ǯ"+money);
    }
}
