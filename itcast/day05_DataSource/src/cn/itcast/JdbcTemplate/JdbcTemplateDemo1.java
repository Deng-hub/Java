package cn.itcast.JdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import cn.itcast.utils.JDBCUtils;

/*
JdbcTemplate����
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.����jar��
        //2.����JDBCTemplate����
        JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
        //3.���÷���
        String sql="update account set money=5000 where id=?";
        int count=template.update(sql,2);
        System.out.println(count);
    }
}
