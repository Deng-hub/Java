package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/*
������һ����ֵ�࣬�������ú�bean.xml��һ����
spring�е���ע��
@Configuration
    ���ã�ָ����ǰ����һ����ֵ��
    ϸ�ڣ�����ֵ����ΪAnnotationConfigApplicationContext���󴴽��Ĳ���ʱ����ע����Բ�д
@ComponentScan
    ���ã�����ͨ��ע��ָ��spring�ڴ�������ʱҪɨ��İ�
    ���ԣ�
        value:����basePackages��������һ���ģ���������ָ����������ʱҪɨ��İ���
        ����ʹ�ô�ע��͵�ͬ����xml����ֵ�ˣ�
                <context:component-scan base-package="com.itheima"></context:component-scan>
@Bean
    ���ã����ڰѵ�ǰ�����ķ���ֵ��Ϊbean�������spring��ioc������
    ���ԣ�
        name:����ָ��bean��id.����дʱ��Ĭ��ֵ�ǵ�ǰ����������
    ϸ�ڣ�
        ������ʹ��ע����ֵ����ʱ����������в�����spring��ܻ��������в�����û�п��õ�bean����
        ���ҵķ�ʽ��Autowiredע���������һ����
@Import
    ���ã����ڵ�����������ֵ��
    ���ԣ�
        value:����ָ��������ֵ����ֽ���
            ������ʹ��Importע��֮��,��Importע�������Ǹ���ֵ�࣬������Ķ�������ֵ��
@PropertySource
    ���ã�����ָ��properties�ļ���λ��
    ���ԣ�
        value:ָ���ļ������ƺ�·��
                �ؼ��֣�classpath ��ʾ��·����
 */
//@Configuration
@ComponentScan(basePackages ={"com.itheima","config"})
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
