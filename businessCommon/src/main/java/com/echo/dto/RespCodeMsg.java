package com.echo.dto;

/**
 * interfaceName: RespCodeMsg <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/9/9 0:07 <BR>
 * version 1.0 jdk1.8 <BR>
 */
public interface RespCodeMsg {
    String SUCCESS_CODE = "SUCCESS";

    String getCode();

    String getMsg();
}
