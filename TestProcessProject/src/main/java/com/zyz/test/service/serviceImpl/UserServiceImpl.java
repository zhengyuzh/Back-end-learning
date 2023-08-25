package com.zyz.test.service.serviceImpl;

import com.zyz.test.mapper.UserMapper;
import com.zyz.test.pojo.User;
import com.zyz.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 12:23
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /** 查询用户信息 */
    @Override
    public List<User> queryUser(User user) {
        return userMapper.queryUser(user);
    }
}
