package com.wjl.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:04
 */
@Data
@Entity
@Table(name = "sys_user")
public class User implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;

  private String password;

  private String email;

  private Long roleId;

  @Serial
  private static final long serialVersionUID = 1L;

}
