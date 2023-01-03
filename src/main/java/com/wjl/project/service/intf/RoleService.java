package com.wjl.project.service.intf;

import com.wjl.project.model.entity.Role;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:57
 */
public interface RoleService {

  long count();

  List<Role> selectAll();

  Role selectById(Long id);

  void add(Role role);

  void update(Role role);

  void deleteById(Long id);

  void deleteAll();

}
