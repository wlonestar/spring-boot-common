package com.wjl.project.model.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:03
 */
@Data
@Embeddable
public class RolePermissionId implements Serializable {

  private Long rid;

  private Long pid;

  @Serial
  private static final long serialVersionUID = 1L;

}
