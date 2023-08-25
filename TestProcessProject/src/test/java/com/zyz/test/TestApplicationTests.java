package com.zyz.test;

import com.zyz.test.pojo.User;
import com.zyz.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUserName("张三");
        List<User> userList = userService.queryUser(user);
        System.out.println("查询到的数据：" + userList.toString());
    }

}
