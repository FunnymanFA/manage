package com.smart.zrf.manage.mapper;

import com.smart.zrf.manage.domain.entity.UserAddress;

public interface UserAddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}