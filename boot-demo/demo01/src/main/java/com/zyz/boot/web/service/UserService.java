package com.zyz.boot.web.service;


import com.zyz.boot.web.pojo.User;
import java.util.List;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 12:22
 * @Description:
 */
public interface UserService {

    /** 查询用户 */
    List<User> queryUser(User user);
}
