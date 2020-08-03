package com.smart.zrf.manage.domain.entity;

import lombok.Data;

@Data
public class User {
    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 1表示启用，0表示禁用
    */
    private Integer status;
}