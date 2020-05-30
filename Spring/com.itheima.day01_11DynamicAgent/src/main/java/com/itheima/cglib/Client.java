package com.itheima.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/*
ģ��һ��������
 */
public class Client {
    public static void main(final String[] args) {
        final Producer producer = new Producer();
        /**
         * ��̬����
         * �ص㣺�ֽ���˭��˭������˭��˭����
         * ���ã����޸�Դ��Ļ����϶Է�����ǿ
         * ���ࣺ
         *      ���ڽӿڵĶ�̬����
         *      ��������Ķ�̬����
         * ��������Ķ�̬����
         *      �漰���ࣺEnhancer
         *      �ṩ�ߣ�������cglib��
         * ��δ����������
         *      ʹ��Enhancer���е�create����
         * ������������Ҫ��
         *      �������಻����������
         * create()�����Ĳ�����
         *  class:�ֽ���
         *      ��������ָ�������������ֽ���
         *  callback:  �����ṩ��ǿ�Ĵ���
         *      ����������д��δ�������һ�㶼��һ���ýӿڵ�ʵ���࣬ͨ������¶��������ڲ��࣬�����Ǳ����
         *      �˽ӿڵ�ʵ���඼��˭��˭д
         *      ����һ��д�Ķ��Ǹýӿڵ��ӽӿ�ʵ���࣬MethodInterceptor
         */
        Producer cglibProducer=(Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            /**
             * ִ�б����������κηŷ����ᾭ���÷���
             * @param proxy
             * @param method
             * @param args
             *      �������������ͻ��ڽӿڵĶ�̬������invoke�ŷ��Ĳ�����һ����
             * @param methodProxy ����Ǯִ�з����Ĵ������
             * @return
             * @throws Throwable
             */
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
        cglibProducer.saleProduct(12000f);
    }
}



