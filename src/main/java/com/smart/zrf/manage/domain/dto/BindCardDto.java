package com.smart.zrf.manage.domain.dto;

import lombok.Data;

/**
 * @author ZRF
 */
@Data
public class BindCardDto {
    /**
    * 银行卡id
    */
    private Integer cardId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户真实姓名
    */
    private String realname;

    /**
    * 用户身份证号
    */
    private String idNumber;

    /**
    * 银行卡号
    */
    private String cardNumber;

    /**
    * 银行预留手机号
    */
    private String phone;

    /**
    * 1表示未删除，0表示删除
    */
    private Integer status;
}