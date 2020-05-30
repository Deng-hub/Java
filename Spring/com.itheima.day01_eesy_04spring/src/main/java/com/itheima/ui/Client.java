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
模拟一个表现层，用于调用业务层
 */
public class Client {
    /*
    获取spring的Ioc核心容器，并根据id获取对象
    ApplicationContext的三个常用实现类：
        ClassPathXmlApplicationContext:它可以加载类路径下的配置文件，要求配置问及那必须在类路径下，不在的话加载不了
        FileSystemXmlApplicationContext:它可以加载磁盘任意路径下的配置文件（必须有访问权限）；
        AnnotationConfigApplicationContext:它是用于读取注解创建容器的。
    核心容器的两个接口引发出的问题：
        ApplicationContext:单例对象适用           采用此接口
            它在构建核心容器时，创建对象采取的策略时采用立即加载的方式，也就是，只要一提取完配置问及那马上就创建配置文件中配置的对象。
            BeanFactory:多列对象适用
                它在构建核心容器时，创建对象采取的策略是延时加载的方式，也就是说什么时候根据id获取对象了，什么时候才之真正的创建对象。
            @param args
     */
    public static void main(String[] args) {
                //1.获取核心容器对象
//        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext ac=new FileSystemXmlApplicationContext("C:\\Users\\Fine\\Desktop\\beans.xml");
        //2.根据id获取Bean对象
        IAccountService as=(IAccountService)ac.getBean("accountService");


        as.saveAccount();
    //手动关闭容器
        ac.close();
    }
}
