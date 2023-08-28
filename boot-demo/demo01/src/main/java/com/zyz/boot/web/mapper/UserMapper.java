package com.zyz.boot.web.mapper;


import com.zyz.boot.web.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 11:44
 * @Description:
 */
@Mapper
public interface UserMapper {
    /** 查询用户信息 */
    List<User> queryUser(User user);
}
