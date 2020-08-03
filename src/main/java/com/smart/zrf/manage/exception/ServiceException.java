package com.smart.zrf.manage.exception;


import com.smart.zrf.manage.common.RespCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ZRF
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceException extends RuntimeException {
    private String msg;
    private int status;

    public ServiceException(RespCode respCode) {
        super(respCode.getMsg());
        this.status = respCode.getStatus();
    }
}
