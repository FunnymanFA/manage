package com.smart.zrf.manage.service;

import com.smart.zrf.manage.domain.dto.UserDto;

/**
 * @author ZRF
 */
public interface UserDtoService {
    /**
     * 修改个人信息
     * @param userDto
     * @return
     */
    int update(UserDto userDto);
}
