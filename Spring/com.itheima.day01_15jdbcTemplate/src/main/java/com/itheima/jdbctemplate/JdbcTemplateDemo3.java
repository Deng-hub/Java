package com.itheima.jdbctemplate;

import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateDemo3 {
    public static void main(String[] args) {
        //1.��ȡ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.��ȡ����
        JdbcTemplate jt=ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //3.ִ�в���
        //����
      //  jt.update("insert into account(name,money) values (?,?)","eee",333f);
        //����
      //  jt.update("update account set name=?,money=? where id=?","test",67348,9);
        //ɾ��
      //  jt.update("delete from account where id=?",9);
        //��ѯ����
//        List<Account> accounts=jt.query("select * from account where money>?",new AccountRowMapper(),1000f);
        //List<Account> accounts=jt.query("select * from account where money>?",new BeanPropertyRowMapper<Account>(Account.class),1000f);
        //for (Account account : accounts) {
            //System.out.println(account);
        //}
        //��ѯһ��
        List<Account> accounts=jt.query("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),2);
        System.out.println(accounts.isEmpty()?"û������":accounts.get(0));

        //��ѯ����һ��һ�У�ʹ�þۺϺ�����������group by�Ӿ䣩
        Integer count=jt.queryForObject("select count(*) from account where money>?",Integer.class,1000f);
        System.out.println(count);
    }
}

/**
 * ����Account�ķ�װ����
 */
class AccountRowMapper implements RowMapper<Account>{
    /**
     * �ѽ�����е����ݷ�װ��Account�У�Ȼ����spring��ÿ��Account�ӵ�������
     * @param rs
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Account mapRow(ResultSet rs, int id) throws SQLException {
        Account account=new Account();
        account.setId(rs.getInt("id"));
        account.setName(rs.getString("name"));
        account.setMoney(rs.getFloat("money"));
        return account;
    }
}