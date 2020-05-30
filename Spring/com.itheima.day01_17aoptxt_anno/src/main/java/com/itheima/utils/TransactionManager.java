package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.concurrent.locks.Lock;

/**
 * �����������صĹ����࣬�������ˣ����������ύ���񣬻ع�������ͷ�����
 */
@Component("txManager")
@Aspect
public class TransactionManager {
    @Autowired
    private ConnectionUtils connectionUtils;
    @Pointcut("execution(* com.itheima.service.impl..*.*(..))")
    private void pt1(){}

    /**
     * ��������
     */

    public void beginTransanction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * �ύ����
     */

    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * �ع�����
     */

    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * �ͷ�����
     */

    public void release(){
        try {
            connectionUtils.getThreadConnection().close();;
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Around("pt1()")
    public Object aroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue=null;
        try {
        //1.��ȡ����
            Object[] args=pjp.getArgs();
            //2.��������
            this.beginTransanction();
            //3.ִ�з���
            rtValue=pjp.proceed(args);
            //4.�ύ����
            this.commit();

            //���ؽ��
            return rtValue;
        }catch (Throwable e){
            //5.�ع�����
            this.rollback();
        throw new RuntimeException(e);
        }finally {
        //6.�ͷ���Դ
            this.release();
        }
    }
}
