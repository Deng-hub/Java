package com.itheima.cast;

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ����queryRunner�Ƿ��ǵ���
 */
public class QueryRunnerTest {
    @Test
    public void testQueryRunner(){
        //1.��ȡ����
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2.��ȡqueryRunner����
        QueryRunner runner=ac.getBean("runner",QueryRunner.class);
        QueryRunner runner1=ac.getBean("runner",QueryRunner.class);
        System.out.println(runner==runner1);
    }
}
