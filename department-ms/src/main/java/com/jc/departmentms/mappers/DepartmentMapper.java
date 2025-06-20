package com.jc.departmentms.services.mappers;

import com.jc.departmentms.dtos.DepartmentDto;
import com.jc.departmentms.models.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {

    public  Department toEntity(DepartmentDto dto) {
        if(dto == null) return null;
        Department depart = new Department();
        depart.setCode(dto.getCode());
        depart.setDepartmentName(dto.getDepartmentName());
        return depart;
    }

    public  DepartmentDto toDto(Department department) {
        if(department == null) return null;
        DepartmentDto dto = new DepartmentDto();
        dto.setCode(department.getCode());
        dto.setCode(department.getDepartmentName());
        return dto;
    }
}
