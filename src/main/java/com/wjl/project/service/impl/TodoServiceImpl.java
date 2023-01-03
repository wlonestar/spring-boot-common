package com.wjl.project.service.impl;

import com.wjl.project.model.entity.Todo;
import com.wjl.project.repository.TodoRepository;
import com.wjl.project.service.intf.TodoService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 15:23
 */
@Slf4j
@Service
@CacheConfig(cacheNames = "todo")
public class TodoServiceImpl implements TodoService {

  @Resource
  private TodoRepository todoRepository;

  @Override
  public long count() {
    return todoRepository.count();
  }

  @Override
  public List<Todo> selectAll() {
    return todoRepository.findAll();
  }

  @Override
  public Todo selectById(Long id) {
    return todoRepository.findById(id).orElseThrow();
  }

  @Override
  public void add(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void update(Todo todo) {
    todoRepository.saveAndFlush(todo);
  }

  @Override
  public void deleteById(Long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public void deleteAll() {
    todoRepository.deleteAll();
  }

}
