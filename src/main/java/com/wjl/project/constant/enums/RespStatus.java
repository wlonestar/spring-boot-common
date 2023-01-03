package com.wjl.project.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 13:03
 */
@Getter
@AllArgsConstructor
public enum RespStatus {

  OK(200, "OK"),

  // ......

  ERROR(500, "server error"),
  ;

  private final int code;
  private final String msg;

}
