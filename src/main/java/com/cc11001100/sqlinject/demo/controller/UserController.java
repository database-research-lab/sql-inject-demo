package com.cc11001100.sqlinject.demo.controller;

import com.cc11001100.sqlinject.demo.service.UserService;
import com.cc11001100.sqlinject.demo.vo.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CC11001100
 * @date 2017/10/7 3:05
 * @email CC11001100@qq.com
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public ResponseDto login(String username, String passwd){
        return ResponseDto.successData(userService.login(username, passwd));
    }

}
