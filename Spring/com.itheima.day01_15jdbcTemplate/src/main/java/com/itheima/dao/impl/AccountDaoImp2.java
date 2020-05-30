package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImp2 implements IAccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Account findAccount(Integer accountId) {
        List<Account> accouts=jdbcTemplate.query("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
        return accouts.isEmpty()?null:accouts.get(0);
    }

    @Override
    public Account findAccountByName(String accountName) {
        List<Account> accouts=jdbcTemplate.query("select * from account where name =?",new BeanPropertyRowMapper<Account>(Account.class),accountName);
        if(accouts.isEmpty()){
            return null;
        }
        if(accouts.size()>1){
            throw new RuntimeException("结果集不唯一");
        }
        return accouts.get(0);
    }

    @Override
    public void updateAccount(Account account) {
    jdbcTemplate.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
