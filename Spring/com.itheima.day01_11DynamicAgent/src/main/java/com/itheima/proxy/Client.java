package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
ģ��һ��������
 */
public class Client {
    public static void main(final String[] args){
        final Producer producer=new Producer();
        /**
         * ��̬����
         * �ص㣺�ֽ���˭��˭������˭��˭����
         * ���ã����޸�Դ��Ļ����϶Է�����ǿ
         * ���ࣺ
         *      ���ڽӿڵĶ�̬����
         *      ��������Ķ�̬����
         * ���ڽӿڵĶ�̬����
         *      �漰���ࣺProxy
         *      �ṩ�ߣ�JDK�ٷ�
         * ��δ����������
         *      ʹ��Proxy���е�newProxyInstance����
         * ������������Ҫ��
         *      ������������ʵ��һ���ӿڣ����û������ʹ��
         * newProxyInstance()�����Ĳ�����
         *  ClassLoader:�������
         *      �������ڼ��ش�������ֽ���ģ��ͱ��������ʹ����ͬ���������,�̶�д����
         *  Class[]���ֽ�������
         *      ���������ô������ͱ������������ͬ����
         *  InvocationHandler  �����ṩ��ǿ�Ĵ���
         *      ����������д��δ�������һ�㶼��һ���ýӿڵ�ʵ���࣬ͨ������¶��������ڲ��࣬�����Ǳ����
         *      �˽ӿڵ�ʵ���඼��˭��˭д
         */
        IProducer proxyProducer=(IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * ���ã�ִ�б����������κνӿڷ������ᾭ���÷���
                     * ���������ĺ���
                     * @param proxy ����������
                     * @param method    ��ǰִ�еķ���
                     * @param args   ��ǰִ�з�������Ĳ���
                     * @return          �ͱ�������󷽷�����ͬ�ķ���ֵ
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //�ṩ��ǿ�Ĵ���
                        Object returnValue=null;
                        //1.��ȡ����ִ�еĲ���
                        Float money=(Float)args[0];
                        //2.�жϵ�ǰ�ŷ��ǲ�������
                        if("saleProduct".equals(method.getName())){
                            returnValue=method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });
        proxyProducer.saleProduct(10000f);
    }
}



