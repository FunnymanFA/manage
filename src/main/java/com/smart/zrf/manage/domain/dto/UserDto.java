package com.smart.zrf.manage.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ZRF
 */
@Data
public class UserDto {
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

    private UserDetailDto userDetailDto;

    private List<UserAddressDto> userAddressDtoList;

    private List<BindCardDto> bindCardDtoList;
}