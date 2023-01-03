package com.wjl.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:21
 */
@Data
@Entity
@Table(name = "todo")
public class Todo implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;

  private String details;

  private boolean done;

}
