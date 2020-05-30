package com.itheima.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/*
模拟一个消费者
 */
public class Client {
    public static void main(final String[] args) {
        final Producer producer = new Producer();
        /**
         * 动态代理：
         * 特点：字节码谁用谁创建，谁用谁加载
         * 作用：不修改源码的基础上对方法增强
         * 分类：
         *      基于接口的动态代理
         *      基于子类的动态代理
         * 基于子类的动态代理
         *      涉及的类：Enhancer
         *      提供者：第三方cglib库
         * 如何创建代理对象：
         *      使用Enhancer类中的create方法
         * 创建代理对象的要求：
         *      被代理类不能是最终类
         * create()方法的参数：
         *  class:字节码
         *      他是用于指定被代理对象的字节码
         *  callback:  用于提供增强的代码
         *      他是让我们写如何代理，我们一般都是一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的
         *      此接口的实现类都是谁用谁写
         *      我们一般写的都是该接口的子接口实现类，MethodInterceptor
         */
        Producer cglibProducer=(Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            /**
             * 执行被代理对象的任何放法都会经过该方法
             * @param proxy
             * @param method
             * @param args
             *      以上三个参数和基于接口的动态代理中invoke放法的参数是一样的
             * @param methodProxy ：当钱执行方法的代理对象
             * @return
             * @throws Throwable
             */
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                //提供增强的代码
                Object returnValue=null;
                //1.获取方法执行的参数
                Float money=(Float)args[0];
                //2.判断当前放法是不是销售
                if("saleProduct".equals(method.getName())){
                    returnValue=method.invoke(producer,money*0.8f);
                }
                return returnValue;
            }
        });
        cglibProducer.saleProduct(12000f);
    }
}



