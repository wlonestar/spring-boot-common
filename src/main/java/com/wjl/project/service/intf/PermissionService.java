package com.wjl.project.service.intf;

import com.wjl.project.model.entity.Permission;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:59
 */
public interface PermissionService {

  long count();

  List<Permission> selectAll();

  Permission selectById(Long id);

  void add(Permission permission);

  void update(Permission permission);

  void deleteById(Long id);

  void deleteAll();

}
