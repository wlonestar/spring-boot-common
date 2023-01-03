package com.wjl.project.repository;

import com.wjl.project.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:51
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
