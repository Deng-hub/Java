package cn.itcast.domain;

import cn.itcast.utils.JDBCUtils;
import com.alibaba.druid.util.JdbcUtils;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.AnnotatedArrayType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {
    //Junit单元测试，可以让方法独立执行
    /*
       1.修改1号数据的money为10000
        */
    //1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1() {
        //2.定义sql
        String sql = "update account set money=10000 where id=1";
        //3.执行sql
        int count = template.update(sql);
        System.out.println(count);
    }

    @Test
    public void test2() {
        //1.获取JDBCTemplate对象
        String sql = "insert into account(id,name,money) values(?,?,?)";
        int count = template.update(sql, 8, "hh", 10);
        System.out.println(count);
    }

    /*
        3.删除刚才添加的记录
     */
    @Test
    public void test3() {
        //1.获取JDBCTemplate对象
        String sql = "delete from account where id=?";
        int count = template.update(sql, 8);
        System.out.println(count);
    }

    /*
        4.查询所有的记录，将其封装为Map集合
        //注意，这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        //1.获取JDBCTemplate对象
        String sql = "select * from account where id=?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);//{id=1, name=aaa, money=10000.0}
    }

    @Test
    public void test5() {
        //1.获取JDBCTemplate对象
        String sql = "select * from account ";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    /*
            6.查询所有记录，将其封装为Account对象的List集合
     */
    @Test
    public void test6() {
        String sql = "select * from account";
        List<Account> list = template.query(sql, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int i) throws SQLException {
                Account account = new Account();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float money = rs.getFloat("money");
                account.setId(id);
                account.setName(name);
                account.setMoney(money);
                return account;
            }
        });
        for (Account ac : list) {
            System.out.println(ac);
        }
    }

    @Test
    public void test7() {
        String sql = "select * from account";
        List<Account> list = template.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        for (Account ac : list) {
            System.out.println(ac);
        }
    }

    /*
    7.查询总记录数}
     */
    @Test
    public void test8() {
        String sql = "select count(id) from Account";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}