package com.jc.departmentms.repositories;

import com.jc.departmentms.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByCode(String code);
}
