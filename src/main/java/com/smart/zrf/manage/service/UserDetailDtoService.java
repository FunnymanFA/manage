package com.smart.zrf.manage.service;

import com.smart.zrf.manage.domain.dto.UserDetailDto;

/**
 * @author ZRF
 */
public interface UserDetailDtoService {
    /**
     * 修改用户详情信息
     * @param userDetailDto
     * @return
     */
    int update(UserDetailDto userDetailDto);
}
