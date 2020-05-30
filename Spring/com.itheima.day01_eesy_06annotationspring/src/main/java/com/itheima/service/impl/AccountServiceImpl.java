package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSOutput;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.PreDestroy;
import javax.ejb.Init;
import java.lang.annotation.Documented;
import java.util.Date;

/*
�˻���ҵ���ʵ����
����CML�����ã�
 <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"
 scope="" init-method="" destroy-method="" >
 <property name="" value="" |ref="><property>
 </bean>

���ڴ��������ע��
    ���ǵ����þͺ���XML�����ļ��б�дһ��<bean>��ǩʵ�ֵĹ��ܶ���һ����
    @Component
        ���ã����ڰѵ�ǰ��������spring������
        ���ԣ�
            value:����ָ��bean��id,�����ǲ�дʱ������Ĭ��ֵ�ǵ�ǰ������������ĸ��Сд
    @Controller һ�����ڱ��ֲ�
    @Service һ������ҵ���
    @Repository һ�����ڳ־ò�
    ��������ע�����ǵ����ú�������Component��һģһ����
    ����������spring���Ϊ�����ṩ��ȷ������ʹ�õ�ע�⣬�����ǵ���������������

����ע�����ݵ�ע��
    ���ǵ����þͺ���xml�����ļ��е�bean��ǩ��дһ��<property>��ǩ������ʱһ����
    @Autowired:
        ����:�Զ���������ע�룬ֻҪ��������Ψһ��һ��bean�������ͺ�Ҫע��ı������ͣ��Ϳ���ע��ɹ�
        ���ioc������û���κ�bean�����ͺ�Ҫע��ı�������ƥ�� ���򱨴�.
        ���ioc�������ж������ƥ��ʱ��
        ����λ�ã�
            �����Ǳ����ϣ�Ҳ�����Ƿ�����
        ϸ�ڣ�
            ��ʹ��ע��ע��ʱ��set�����Ͳ��Ǳ������
     @Qualifier:
        ���ã��ڰ�������ע��Ļ���֮���ٰ�������ע�룬���ڸ����Աע��ʱ���ܵ���ʹ�ã������ڸ���������ע��ʱ����
        ���ԣ�
            value:����ָ��ע��bean��id
     @Resource:
        ���ã�ֱ�Ӱ���bean��idע�룬�����Զ���ʹ��
        ���ԣ�
            name:����ָ��bean��id
       ��������ע�붼ֻ��ע������bean���͵����ݣ����������ͺ�String�����޷�ʹ������ע��ʵ�֡�
       ���⣬�������͵�ע��ֻ��ͨ��XML��ʵ��.

      @Value
        ���ã�����ע��������ͺ�String���͵�����
        ���ԣ�
            value:����ָ�����ݵ�ֵ��������ʹ��spring��SpEl(Ҳ����spring��el���ʽ)
                SpEl��д����${���ʽ}
���ڸı����÷�Χ��
    ���ǵ����ü�����bean��ǩ��ʹ��scope����ʵ�ֵĹ�����һ����
       @Scope
         ���ã�����ָ��bean������
         ���ԣ�
            value:ָ����Χ��ȡֵ������ȡֵ��singleton prototype
������������ص�
    ���ǵ����þͺ���bean��ǩ��ʹ��init-method��destroy-method��������һ����
        @PreDestroy
            ���ã�����ָ�����ٷ���
        @PostConstruct
            ���ã�����ָ����ʼ������
 */
@Service(value = "accountService")
//@Scope("prototype")
public class AccountServiceImpl implements IAccountService {
//    @Autowired
//    @Qualifier("accountDao2")
    @Resource(name="accountDao")
    private IAccountDao accountDao=null;

    public void saveAccount(){
    accountDao.saveAccount();
    }
    @PostConstruct
    public void init(){
        System.out.println("��ʼ������ִ����");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("���ٷ���ִ����");
    }

}
