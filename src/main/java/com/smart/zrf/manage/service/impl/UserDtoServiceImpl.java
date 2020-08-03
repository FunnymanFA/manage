package com.smart.zrf.manage.service.impl;

import com.smart.zrf.manage.domain.dto.UserDetailDto;
import com.smart.zrf.manage.domain.dto.UserDto;
import com.smart.zrf.manage.mapper.dto.UserDetailDtoMapper;
import com.smart.zrf.manage.mapper.dto.UserDtoMapper;
import com.smart.zrf.manage.service.UserDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZRF
 */
@Service
public class UserDtoServiceImpl implements UserDtoService {
    @Resource
    UserDtoMapper userDtoMapper;

    @Resource
    UserDetailDtoMapper userDetailDtoMapper;

    @Override
    public int update(UserDto userDto) {
        int count1 = userDtoMapper.update(userDto);
        UserDetailDto userDetailDto = userDto.getUserDetailDto();
        userDetailDto.setUserId(userDto.getUserId());
        int count2 = userDetailDtoMapper.update(userDetailDto);
        return count2;
    }
}
