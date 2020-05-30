package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ��¼��־�Ĺ����࣬�������ṩ�˹����Ĵ���
 */
public class Logger {
    /**
     * ǰ��֪ͨ
     */
    public void beforePrintLog(){
        System.out.println("Logger���е�beforePrintLog������ʼ��¼��־��...");
    }
    /**
     * ����֪ͨ
     */
    public void afterReturningPrintLog(){
        System.out.println("Logger���е�afterReturningPrintLog������ʼ��¼��־��...");
    }
    /**
     * �쳣֪ͨ
     */
    public void afterThrowingPrintLog(){
        System.out.println("Logger���е�afterThrowingPrintLog������ʼ��¼��־��...");
    }
    /**
     * ����֪ͨ
     */
    public void afterPrintLog(){
        System.out.println("Logger���е�afterLog������ʼ��¼��־��...");
    }

    /**
     * ����֪ͨ
     * ����:
     *      �����������˻���֪֮ͨ������㷽��û��ִ�У���֪ͨ����ִ����
     *������
     *      ֪ͨ�Աȶ�̬�����еĻ���֪ͨ���룬���ֶ�̬����Ļ���֪ͨ����ȷ������㷽�����ã������ǵĴ�����û�У�
     * �����
     *      Spring���Ϊ�����ṩ��һ���ӿڣ�ProceedingJoinPoint���÷������൱����ȷ��������㷽��
     *      �ýӿڿ�����Ϊ����֪ͨ�ķ����������ڳ���ִ��ʱ��spring��ܻ�Ϊ�����ṩ�ýӿڵ�ʵ���๩����ʹ��
     * spring�еĻ���֪ͨ��
     *      ����spring���Ϊ�����ṩ�͵�һ�ֿ����ڴ������ֶ�������ǿ������ʱִ�еķ���
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object rtValue=null;
        try{
            Object[] args=pjp.getArgs();//�õ�����ִ������Ĳ���

            System.out.println("Logger���е�aroundPrintLog������ʼ��¼��־��...ǰ��");

            rtValue=pjp.proceed();//��ȷ����ҵ��㷽��������㷽����

            System.out.println("Logger���е�aroundPrintLog������ʼ��¼��־��...����");

            return rtValue;
        }catch (Throwable t){
            System.out.println("Logger���е�aroundPrintLog������ʼ��¼��־��...�쳣");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Logger���е�aroundPrintLog������ʼ��¼��־��...����");
        }

    }
}
