## 练习SQL注入的靶子项目

练习SQL注入的时候总不好去搞别人的网站，于是就写了个小东西暴露一个有SQL注入的接口，攻击这个接口就可以啦。
```
http://localhost:8080/user/login?username=foo&passwd=bar
```

#### 所用技术栈
Spring Boot + Spring MVC + JdbcTemplate 

#### mysql建表语句  
```
DROP DATABASE IF EXISTS sql_inject_demo;
CREATE DATABASE sql_inject_demo;
USE sql_inject_demo;

DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user(
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) COMMENT '用户名',
    passwd CHAR(32) COMMENT '密码'
) CHARSET UTF8;

INSERT INTO t_user (username, passwd) VALUES ('admin', MD5('admin'));

```




