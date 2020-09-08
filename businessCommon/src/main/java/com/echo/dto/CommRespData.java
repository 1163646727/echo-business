package com.echo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * className: CommRespData <BR>
 * description: 响应主体实体 <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/9/9 0:02 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@ApiModel("响应主体实体")
public class CommRespData<T>{
    @ApiModelProperty("主要数据")
    private T dataInfo;
    @ApiModelProperty("分页信息")
    private PageInfo pageInfo;
}
