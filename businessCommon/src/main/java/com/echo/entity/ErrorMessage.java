package com.echo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * className: ErrorMessage <BR>
 * description: 全局异常捕捉实体类<BR>
 * remark: 实体用于记录具体的 异常信息，并响应 客户端<BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-16 15:58 <BR>
 */
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ErrorMessage<T> {
    // 状态码(1.正常  0.异常)
    public static final Integer OK = 1;
    public static final Integer ERROR = 0;

    // 状态码(1.正常  0.异常)
    private Integer code;
    // ChenQi 2019/4/25;  异常信息
    private String msg;
    // ChenQi 2019/4/25;  记录异常所在的方法
    private String url;
    // ChenQi 2019/4/25; 异常主体
    private T data;
}