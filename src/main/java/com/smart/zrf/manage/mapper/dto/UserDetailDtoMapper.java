package com.smart.zrf.manage.mapper.dto;

import com.smart.zrf.manage.domain.dto.UserDetailDto;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZRF
 */
public interface UserDetailDtoMapper {
    /**
     * 修改用户详情信息
     * @param userDetailDto
     * @return
     */
    int update(@Param("userDetailDto") UserDetailDto userDetailDto);
}
