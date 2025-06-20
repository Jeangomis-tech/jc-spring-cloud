package com.jc.departmentms.mappers;

import com.jc.departmentms.dtos.DepartmentDto;
import com.jc.departmentms.models.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {

    public  Department toEntity(DepartmentDto dto) {

        Department depart = new Department();
        if(dto.getId() != null){
            depart.setId(dto.getId());
        }
        depart.setCode(dto.getCode());
        depart.setDepartmentName(dto.getDepartmentName());
        return depart;
    }

    public  DepartmentDto toDto(Department department) {
        DepartmentDto dto = new DepartmentDto();
        dto.setId(department.getId());
        dto.setCode(department.getCode());
        dto.setDepartmentName(department.getDepartmentName());
        return dto;
    }
}
