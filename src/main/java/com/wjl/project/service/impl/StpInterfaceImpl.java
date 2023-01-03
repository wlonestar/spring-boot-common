package com.wjl.project.service.impl;

import cn.dev33.satoken.stp.StpInterface;
import com.wjl.project.model.entity.RolePermission;
import com.wjl.project.service.intf.PermissionService;
import com.wjl.project.service.intf.RolePermissionService;
import com.wjl.project.service.intf.RoleService;
import com.wjl.project.service.intf.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:10
 */
@Component
public class StpInterfaceImpl implements StpInterface {

  @Resource
  private UserService userService;

  @Resource
  private RoleService roleService;

  @Resource
  private PermissionService permissionService;

  @Resource
  private RolePermissionService rolePermissionService;

  @Override
  public List<String> getPermissionList(Object loginId, String loginType) {
    Long roleId = userService.selectById(Long.valueOf((String) loginId)).getRoleId();
    List<RolePermission> rolePermissions = rolePermissionService.selectAllByRoleId(roleId);
    List<String> permissions = new ArrayList<>();
    for (RolePermission rolePermission : rolePermissions) {
      Long rid = rolePermission.getId().getRid();
      String name = permissionService.selectById(rid).getName();
      permissions.add(name);
    }
    return permissions;
  }

  @Override
  public List<String> getRoleList(Object loginId, String loginType) {
    Long roleId = userService.selectById(Long.valueOf((String) loginId)).getRoleId();
    return List.of(roleService.selectById(roleId).getName());
  }

}
