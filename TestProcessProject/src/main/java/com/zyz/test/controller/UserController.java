package com.zyz.test.controller;

import com.zyz.test.config.response.Result;
import com.zyz.test.pojo.User;
import com.zyz.test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 11:44
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/system/user")
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Result queryUser(User user){
        log.info("Enter queryUser Method...");
        List<User> userList = userService.queryUser(user);
        if(userList != null){
            return Result.ok().data("userList",userList);
        }
        return Result.error();


    }
}
