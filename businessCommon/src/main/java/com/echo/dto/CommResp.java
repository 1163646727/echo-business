package com.echo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * className: CommResp <BR>
 * description: 统一返回实体<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/9/8 23:52 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("统一返回实体")
public class CommResp<T> {
    @ApiModelProperty("业务响应码")
    protected String code;
    @ApiModelProperty("成功响应消息")
    protected String sucMsg;
    @ApiModelProperty("失败响应消息")
    protected String failMsg;
    @ApiModelProperty("响应主体内容")
    protected CommRespData<T> data;

    public CommResp(RespCodeMsg respCodeMsg) {
        if (respCodeMsg == null) {
            respCodeMsg = RespCodeMsgImpl.SUCCESS;
        }
        this.code = ((RespCodeMsg)respCodeMsg).getCode();
        if ("SUCCESS".equals(((RespCodeMsg)respCodeMsg).getCode())) {
            this.sucMsg = ((RespCodeMsg)respCodeMsg).getMsg();
        } else {
            this.failMsg = ((RespCodeMsg)respCodeMsg).getMsg();
        }

    }

    public static CommResp defaultResp() {
        return new CommResp(RespCodeMsgImpl.SUCCESS);
    }
    public CommResp(T data) {
        //this((Object)data, (PageInfo)null);
    }

}
