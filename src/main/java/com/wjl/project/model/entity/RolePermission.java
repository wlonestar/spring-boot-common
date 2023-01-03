package com.wjl.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:29
 */
@Data
@Entity
@Table(name = "role_permission")
public class RolePermission implements Serializable {

  @EmbeddedId
  private RolePermissionId id;

  @Serial
  private static final long serialVersionUID = 1L;

}
