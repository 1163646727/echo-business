package com.echo.dto;

/**
 * enumName: RespCodeMsgImpl <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/9/9 0:08 <BR>
 * version 1.0 jdk1.8 <BR>
 */
public enum RespCodeMsgImpl implements RespCodeMsg {
    SUCCESS("操作成功"),
    TOO_MANY_REQUEST("请求过于频繁"),
    REQ_BLOCKED("请求被阻拦。可能原因：1. 系统繁忙；2. 没有访问权限。"),
    SERVICE_UNAVAILABLE("服务暂时不可用，请稍后再试"),
    BAD_REQUEST("错误的请求"),
    UNAUTHORIZED("未认证，请先登录"),
    NOT_FOUND("访问的资源不存在"),
    FORBIDDEN("不允许访问"),
    INTERNAL_SERVER_ERROR("服务器异常");

    private String message;

    public String getMessage() {
        return this.message;
    }
    private RespCodeMsgImpl(String message) {
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public String getMsg() {
        return this.getMessage();
    }
}
