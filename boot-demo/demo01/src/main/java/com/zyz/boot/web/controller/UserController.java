package com.zyz.boot.web.controller;


import com.zyz.boot.web.pojo.User;
import com.zyz.boot.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void queryUser(User user){
        log.info("Enter queryUser Method...");
        List<User> userList = userService.queryUser(user);
        System.out.println(userList.toString());

    }
}
