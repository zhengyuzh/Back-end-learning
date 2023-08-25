package com.zyz.test.config.response;

public enum ResultCode implements CustomizeResultCode{
    /**
     * 200:操作成功
     */
    SUCCESS(200,"成功"),

    /**
     * 9999：响应失败
     */
    ERROR(9999,"失败"),
    /**
     * 6666：密码不正确
     */
    PWD_NOT_CORRECT(6666,"输入的密码不正确！请重新尝试！"),

    /**
     * 6667：尚未登录
     */
    NOT_LOGIN(6667,"尚未登录"),

    /**
     * 6668：算数异常
     */
    ARITHM_ETICEXCEPTION(6668,"算数异常"),

    /**
     * 登录用户名不存在
     */
    USER_NOT_FOUND_EXCEPTION(6669,"登录用户名不存在"),

    /**
     * 注册失败
     */
    USER_REGISTER_ERROR(6670,"注册失败"),
    /**
     * 删除用户失败，请稍后再试！！！
     */
    DELETE_USER_ERROR(6671,"删除用户失败!!!"),
    /**
     * 查询的用户不存在
     */
    NOT_FIND_USER(6672,"查询的用户不存在"),
    /**
     * 修改用户信息失败
     */
    UPDATE_USER_ERROR(6673,"修改用户失败"),
    /**
     * 修改密码失败
     */
    UPDATE_PASSWORD_ERROR(6573,"修改密码失败！！！"),
    /**
     * 添加汽车失败
     */
    ADD_CAR_ERROR(6674,"添加汽车失败"),
    /**
     * 下架汽车失败
     */
    DELETE_CAR_LOGICAL_ERROR(6675,"下架汽车失败"),
    /**
     * 修改汽车失败
     */
    UPDATE_CAR_ERROR(6676,"修改汽车配置失败"),
    /**
     * 查询某一个汽车失败
     */
    FIND_ONE_CAR_ERROR(6677,"查询某一个汽车失败"),
    /**
     * 查询所有汽车信息失败
     */
    FIND_ALL_CAR_ERROR(6678,"查询所有的汽车失败"),

    /**
     * 生成订单信息表失败
     */
    ADD_ORDERS_ERROR(6680,"生成订单信息表失败!!!"),
    /**
     * 根据id删除订单信息表失败
     */
    DELETE_ORDERSBYID_ERROR(6681,"除订单信息表失败!!!"),
    /**
     * 根据id查询订单信息表失败
     */
    QUERY_ONEORDER_ERROR(6682,"查询订单信息表失败!!!"),
    /**
     * 404：没有找到对应的请求路径
     */
    PAGE_NOT_FOUND(404,"请求的页面飞向了外太空。。。"),

    /**
     * 500：服务端异常
     */
    INTERNAL_SERVER_ERROR(500,"服务器冒烟了。。。等下访问"),

    /**
     * 201 ：未知异常
     */
    UNKNOW_SERVER_ERROR(201,"未知异常，请联系管理员")
    ;
    private Integer code;
    private String message;

    ResultCode(Integer code, String message){
        this.code=code;
        this.message=message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
