package com.cc11001100.sqlinject.demo.service;

import com.cc11001100.sqlinject.demo.dao.UserDao;
import com.cc11001100.sqlinject.demo.vo.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author CC11001100
 * @date 2017/10/7 3:13
 * @email CC11001100@qq.com
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean login(String username, String passwd){
//        String hashPasswd = DigestUtils.md5Hex(passwd.charAt(0) + passwd + passwd.charAt(passwd.length()-1));
        return !userDao.find(username, passwd).isEmpty();
    }

}
