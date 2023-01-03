package com.wjl.project.service.impl;

import com.wjl.project.model.entity.RolePermission;
import com.wjl.project.model.entity.RolePermissionId;
import com.wjl.project.repository.RolePermissionRepository;
import com.wjl.project.service.intf.RolePermissionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:06
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

  @Resource
  private RolePermissionRepository rolePermissionRepository;

  @Override
  public long count() {
    return rolePermissionRepository.count();
  }

  @Override
  public List<RolePermission> selectAll() {
    return rolePermissionRepository.findAll();
  }

  @Override
  public List<RolePermission> selectAllByRoleId(Long rid) {
    List<RolePermission> rolePermissions = rolePermissionRepository.findAll();
    return rolePermissions.stream()
        .filter(rolePermission -> rolePermission.getId().getRid().equals(rid))
        .collect(Collectors.toList());
  }

  @Override
  public RolePermission selectById(RolePermissionId id) {
    return rolePermissionRepository.findById(id).orElseThrow();
  }

  @Override
  public void add(RolePermission rolePermission) {
    rolePermissionRepository.save(rolePermission);
  }

  @Override
  public void update(RolePermission rolePermission) {
    // Todo: this is not a good practice
    rolePermissionRepository.saveAndFlush(rolePermission);
  }

  @Override
  public void deleteById(RolePermissionId id) {
    rolePermissionRepository.deleteById(id);
  }

  @Override
  public void deleteAll() {
    rolePermissionRepository.deleteAll();
  }

}
