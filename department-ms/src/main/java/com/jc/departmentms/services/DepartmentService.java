package com.jc.departmentms.services;

import com.jc.departmentms.dtos.DepartmentDto;
import com.jc.departmentms.models.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

    DepartmentDto getDepartmentByCode(String departmentCode);
}
