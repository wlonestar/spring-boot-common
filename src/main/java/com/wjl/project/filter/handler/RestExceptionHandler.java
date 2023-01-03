package com.wjl.project.filter.handler;

import com.wjl.project.constant.consts.RespResult;
import com.wjl.project.constant.enums.RespStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 13:14
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(value = {Exception.class})
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, code = HttpStatus.INTERNAL_SERVER_ERROR)
  public RespResult<?> exception(Exception e) {
    log.error("global error: {}", e.getMessage(), e);
    return RespResult.fail(RespStatus.ERROR.getCode(), e.getMessage());
  }

  // ...

}
