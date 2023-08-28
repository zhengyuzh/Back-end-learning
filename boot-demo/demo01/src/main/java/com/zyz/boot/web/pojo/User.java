package com.zyz.boot.web.pojo;

import lombok.Data;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 11:45
 * @Description:
 */
@Data
public class User {

    /** 用户ID */
    private Long userId;
    /** 登录账号 */
    private String loginName;
    /** 登录密码 */
    private String password;
    /** 加密密码 */
    private String salt;
    /** 用户姓名 */
    private String userName;
    /** 邮箱 */
    private String email;
    /** 手机号 */
    private String phonenumber;
    /** 头像地址 */
    private String avatar;

}
