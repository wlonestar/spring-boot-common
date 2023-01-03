package com.wjl.project.constant.consts;

import com.wjl.project.constant.enums.RespStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 13:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespResult<T> {

  private long timestamp;
  private int status;
  private String message;
  private T data;

  public static <T> RespResult<T> success() {
    return RespResult.<T>builder()
      .timestamp(System.currentTimeMillis())
      .status(RespStatus.OK.getCode())
      .message(RespStatus.OK.getMsg())
      .build();
  }

  public static <T> RespResult<T> success(T data) {
    return RespResult.<T>builder()
        .timestamp(System.currentTimeMillis())
        .status(RespStatus.OK.getCode())
        .message(RespStatus.OK.getMsg())
        .data(data)
        .build();
  }

  public static <T> RespResult<T> fail(int status, String message) {
    return RespResult.<T>builder()
      .timestamp(System.currentTimeMillis())
      .status(status)
      .message(message)
      .build();
  }

}
