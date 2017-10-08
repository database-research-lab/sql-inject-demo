package com.cc11001100.sqlinject.demo.dao;

import com.cc11001100.sqlinject.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CC11001100
 * @date 2017/10/7 3:25
 * @email CC11001100@qq.com
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate mysql;

    public List<User> find(String username, String passwd){
        String sql = "SELECT * FROM t_user WHERE username='" + username + "' and passwd='" + passwd + "'";
        return mysql.queryForList(sql, User.class);
    }

}
