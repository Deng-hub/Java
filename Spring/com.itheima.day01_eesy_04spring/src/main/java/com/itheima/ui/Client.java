package com.itheima.ui;


import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
ģ��һ�����ֲ㣬���ڵ���ҵ���
 */
public class Client {
    /*
    ��ȡspring��Ioc����������������id��ȡ����
    ApplicationContext����������ʵ���ࣺ
        ClassPathXmlApplicationContext:�����Լ�����·���µ������ļ���Ҫ�������ʼ��Ǳ�������·���£����ڵĻ����ز���
        FileSystemXmlApplicationContext:�����Լ��ش�������·���µ������ļ��������з���Ȩ�ޣ���
        AnnotationConfigApplicationContext:�������ڶ�ȡע�ⴴ�������ġ�
    ���������������ӿ������������⣺
        ApplicationContext:������������           ���ô˽ӿ�
            ���ڹ�����������ʱ�����������ȡ�Ĳ���ʱ�����������صķ�ʽ��Ҳ���ǣ�ֻҪһ��ȡ�������ʼ������Ͼʹ��������ļ������õĶ���
            BeanFactory:���ж�������
                ���ڹ�����������ʱ�����������ȡ�Ĳ�������ʱ���صķ�ʽ��Ҳ����˵ʲôʱ�����id��ȡ�����ˣ�ʲôʱ���֮�����Ĵ�������
            @param args
     */
    public static void main(String[] args) {
                //1.��ȡ������������
//        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext ac=new FileSystemXmlApplicationContext("C:\\Users\\Fine\\Desktop\\beans.xml");
        //2.����id��ȡBean����
        IAccountService as=(IAccountService)ac.getBean("accountService");


        as.saveAccount();
    //�ֶ��ر�����
        ac.close();
    }
}
