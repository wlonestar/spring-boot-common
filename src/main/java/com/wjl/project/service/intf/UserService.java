package com.wjl.project.service.intf;

import com.wjl.project.model.entity.User;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:53
 */
public interface UserService {

  long count();

  List<User> selectAll();

  User selectById(Long id);

  void add(User user);

  void update(User user);

  void deleteById(Long id);

  void deleteAll();

}
