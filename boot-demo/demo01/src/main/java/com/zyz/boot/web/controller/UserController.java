package com.zyz.boot.web.controller;


import com.zyz.boot.web.pojo.School;
import com.zyz.boot.web.pojo.User;
import com.zyz.boot.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 11:44
 * @Description:
 */
@Slf4j
@Controller
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

    @RequestMapping(value = "/getOneObject", method = RequestMethod.GET)
    public String toObject(ModelMap map){
        User user = new User();
        user.setUserId(1L);
        user.setUserName("张三");
        user.setEmail("zs@qq.com");
        user.setPassword("123456");
        map.addAttribute("user",user);
        return "index";
    }

    @RequestMapping("/toSchool")
    public String toAddUser(ModelMap map){
        School school = new School();
        school.setName("清华大学");
        school.setAddress("北京");
        map.addAttribute("school",school);
        return "addSchool";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute School school,ModelMap map){
        System.out.println(school.toString());
        map.addAttribute("school",school);
        return "addSchool";
    }

    @RequestMapping(value = "/queryUserList", method = RequestMethod.GET)
    public String userList(ModelMap model){
        User user = new User();
        List<User> userList = userService.queryUser(user);
        model.addAttribute("userList",userList);
        return "userList";
    }
}
