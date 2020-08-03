package com.smart.zrf.manage.handler;


import com.smart.zrf.manage.common.RespEntity;
import com.smart.zrf.manage.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author ZRF
 */
@RestControllerAdvice
@Slf4j
public class GlobalHandlerException {

    @ExceptionHandler(Exception.class)
    public RespEntity<Object> handler(Exception e) {
        if (e instanceof ServiceException) {
            log.error(e.getMessage());
        }
        return RespEntity.error();
    }
}
