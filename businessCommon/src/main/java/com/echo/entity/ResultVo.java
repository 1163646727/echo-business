package com.echo.entity;

import lombok.Data;

/**
 * className: ResultVo <BR>
 * description: 用户封装返回结果的实体类<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-16 14:49 <BR>
 */
@Data
public class ResultVo<T> {
    /**ChenQi 2019/4/26; 状态码(1.正常  0.异常)*/
    private Integer code;
    /**ChenQi 2019/4/26; 提示信息*/
    private String msg;
    /**ChenQi 2019/4/26; 响应数据*/
    private T data;
}
