package com.smart.zrf.manage.service.impl;

import com.smart.zrf.manage.domain.dto.UserDetailDto;
import com.smart.zrf.manage.mapper.dto.UserDetailDtoMapper;
import com.smart.zrf.manage.service.UserDetailDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZRF
 */
@Service
public class UserDetailDtoServiceImpl implements UserDetailDtoService {
    @Resource
    UserDetailDtoMapper userDetailDtoMapper;

    @Override
    public int update(UserDetailDto userDetailDto) {
        int count = userDetailDtoMapper.update(userDetailDto);
        return count;
    }
}
