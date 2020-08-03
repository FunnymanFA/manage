package com.smart.zrf.manage.mapper.dto;

import com.smart.zrf.manage.domain.dto.UserDto;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZRF
 */
public interface UserDtoMapper {
    /**
     * 修改个人信息
     * @param userDto
     * @return
     */
    int update(@Param("userDto")UserDto userDto);
}
