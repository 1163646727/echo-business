package com.echo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * className: PageInfo <BR>
 * description: 分页信息实体 <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/9/9 0:03 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@ApiModel("分页信息实体")
public class PageInfo {
    @ApiModelProperty("当前页码, 从1开始")
    private Integer pageNum;
    @ApiModelProperty("每页数据量")
    private Integer pageSize;
    @ApiModelProperty("总数据量")
    private Long totalCount;
    @ApiModelProperty("总页数")
    private Integer totalPageNum;
}
