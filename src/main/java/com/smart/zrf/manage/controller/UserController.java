package com.smart.zrf.manage.controller;

import com.smart.zrf.manage.common.RespEntity;
import com.smart.zrf.manage.domain.dto.UserDto;
import com.smart.zrf.manage.exception.ServiceException;
import com.smart.zrf.manage.service.UserDtoService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZRF
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserDtoService userDtoService;

    @PutMapping("/update")
    public RespEntity<Integer> update(@RequestBody UserDto userDto) throws ServiceException {
        int count = userDtoService.update(userDto);
        return RespEntity.success(count);

    }
}
