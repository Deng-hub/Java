package com.itheima.cast;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
ʹ��Junit��Ԫ���ԣ��������ǵ�����
Spring����junit��ֵ
    1.����spring����junit��jar(����)
    2.ʹ��Junit�ṩ��һ��ע���ԭ�е�main�����滻�ˣ��滻��spring�ṩ��
        @RunWith
    3.��֪spring��������,spring��ioc����ʱ����xml����ע��ģ�����˵��λ��
        @ContextConfiguration
            locations:ָ��xml�ļ���λ�ã�����classpath�ؼ���,��ʾ����·����
            classes:ָ��ע�������ڵ�λ��
������ʹ��spring5.x�汾��ʱ��Ҫ��junit��jar����ʱ4.12������
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    private IAccountService as=null;

    @Test
    public void testTransfer(){
        as.transfer("aaa","bbb",100f);
    }

}
