package com.wjl.project.service.impl;

import com.wjl.project.model.entity.Permission;
import com.wjl.project.repository.PermissionRepository;
import com.wjl.project.service.intf.PermissionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:01
 */
@Service
public class PermissionServiceImpl implements PermissionService {

  @Resource
  private PermissionRepository permissionRepository;

  @Override
  public long count() {
    return permissionRepository.count();
  }

  @Override
  public List<Permission> selectAll() {
    return permissionRepository.findAll();
  }

  @Override
  public Permission selectById(Long id) {
    return permissionRepository.findById(id).orElseThrow();
  }

  @Override
  public void add(Permission permission) {
    permissionRepository.save(permission);
  }

  @Override
  public void update(Permission permission) {
    // Todo: this is not a good practice
    permissionRepository.saveAndFlush(permission);
  }

  @Override
  public void deleteById(Long id) {
    permissionRepository.deleteById(id);
  }

  @Override
  public void deleteAll() {
    permissionRepository.deleteAll();
  }

}
