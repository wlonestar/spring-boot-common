package com.wjl.project.service.impl;

import com.wjl.project.model.entity.Role;
import com.wjl.project.repository.RoleRepository;
import com.wjl.project.service.intf.RoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:58
 */
@Service
public class RoleServiceImpl implements RoleService {

  @Resource
  private RoleRepository roleRepository;

  @Override
  public long count() {
    return roleRepository.count();
  }

  @Override
  public List<Role> selectAll() {
    return roleRepository.findAll();
  }

  @Override
  public Role selectById(Long id) {
    return roleRepository.findById(id).orElseThrow();
  }

  @Override
  public void add(Role role) {
    roleRepository.save(role);
  }

  @Override
  public void update(Role role) {
    // Todo: this is not a good practice
    roleRepository.saveAndFlush(role);
  }

  @Override
  public void deleteById(Long id) {
    roleRepository.deleteById(id);
  }

  @Override
  public void deleteAll() {
    roleRepository.deleteAll();
  }

}
