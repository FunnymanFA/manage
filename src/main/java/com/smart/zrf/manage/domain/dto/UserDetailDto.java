package com.smart.zrf.manage.domain.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ZRF
 */
@Data
public class UserDetailDto {
    /**
    * 用户详情id
    */
    private Integer userdetailId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户昵称
    */
    private String nickname;

    /**
    * 用户生日
    */
    private Date birthday;

    /**
    * 1表示男，2表示女，3表示保密
    */
    private Integer sex;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 邮箱地址
    */
    private String email;

    /**
    * 1表示未删除，0表示删除
    */
    private Integer status;
}