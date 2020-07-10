package com.echo.dto;

import lombok.Data;

/**
 * className: UserDTO <BR>
 * description: 用户信息<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-10 14:28 <BR>
 */
@Data
public class UserDTO {

    /**
     * 用户id
     */
    private String id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String fullname;




}
