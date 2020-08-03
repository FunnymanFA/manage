package com.smart.zrf.manage.mapper;

import com.smart.zrf.manage.domain.entity.BindCard;

public interface BindCardMapper {
    int deleteByPrimaryKey(Integer cardId);

    int insert(BindCard record);

    int insertSelective(BindCard record);

    BindCard selectByPrimaryKey(Integer cardId);

    int updateByPrimaryKeySelective(BindCard record);

    int updateByPrimaryKey(BindCard record);
}