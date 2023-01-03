package com.wjl.project.service.intf;

import com.wjl.project.model.entity.RolePermission;
import com.wjl.project.model.entity.RolePermissionId;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:02
 */
public interface RolePermissionService {

  long count();

  List<RolePermission> selectAll();

  List<RolePermission> selectAllByRoleId(Long rid);

  RolePermission selectById(RolePermissionId id);

  void add(RolePermission rolePermission);

  void update(RolePermission rolePermission);

  void deleteById(RolePermissionId id);

  void deleteAll();

}
