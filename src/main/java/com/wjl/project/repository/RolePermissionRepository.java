package com.wjl.project.repository;

import com.wjl.project.model.entity.RolePermission;
import com.wjl.project.model.entity.RolePermissionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @version 0.0.1
 * @time 2023/1/3 14:52
 */
@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, RolePermissionId> {
}
