package com.itheima.proxy;

/**
 * ����������Ҫ��Ľӿ�
 */
public interface IProducer {
    /**
     * ����
     * @param money
     */
    public void saleProduct(float money);

    /**
     * �ۺ�
     * @param money
     */
    public void afterService(float money);
}
