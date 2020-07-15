package com.echo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * className: SysUser <BR>
 * description: 系统用户实体类<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-15 19:43 <BR>
 */
@Data
public class SysUser implements Serializable{
   private Long id;

   private String nid;

   private String username;

   private String nickname;

   private String password;

   private String salt;

   private Long deptId;

   private String picture;

   private String sex;

   private String email;

   private String phone;

   private String remark;

   private Date createDate;

   private Date updateDate;

   private Byte status;

}