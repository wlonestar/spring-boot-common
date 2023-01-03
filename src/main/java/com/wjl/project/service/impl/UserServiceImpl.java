package com.wjl.project.service.impl;

import com.wjl.project.model.entity.User;
import com.wjl.project.repository.UserRepository;
import com.wjl.project.service.intf.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:54
 */
@Service
public class UserServiceImpl implements UserService {

  @Resource
  private UserRepository userRepository;

  @Override
  public long count() {
    return userRepository.count();
  }

  @Override
  public List<User> selectAll() {
    return userRepository.findAll();
  }

  @Override
  public User selectById(Long id) {
    return userRepository.findById(id).orElseThrow();
  }

  @Override
  public void add(User user) {
    userRepository.save(user);
  }

  @Override
  public void update(User user) {
    // Todo: this is not a good practice
    userRepository.saveAndFlush(user);
  }

  @Override
  public void deleteById(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public void deleteAll() {
    userRepository.deleteAll();
  }

}
