package com.zyz.test.config.handler;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/25 14:23
 * @Description:
 */
public class BusinessException extends RuntimeException{
    @ApiModelProperty(value="状态码")
    private Integer code;

    @ApiModelProperty(value="错误信息")
    private String errMsg;
}
