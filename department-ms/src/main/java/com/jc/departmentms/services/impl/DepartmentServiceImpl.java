package com.jc.departmentms.services.impl;

import com.jc.departmentms.dtos.DepartmentDto;
import com.jc.departmentms.models.Department;
import com.jc.departmentms.repositories.DepartmentRepository;
import com.jc.departmentms.services.DepartmentService;
import com.jc.departmentms.mappers.DepartmentMapper;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    private final  DepartmentRepository departmentRepository;

    private final  DepartmentMapper mapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentMapper mapper) {
        this.departmentRepository = departmentRepository;
        this.mapper = mapper;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {

    //Validation du paramètre
        if(code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        //Récupérer l'entité
        Department department = departmentRepository.findByCode(code);
        if(department == null) {
            throw new IllegalArgumentException("Department with code " + code + " not found");
        }
         //Conversion Entité->Dto avec le mapper
        return mapper.toDto(department);

    }

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = mapper.toEntity(departmentDto);
        Department savedDepart =  departmentRepository.save(department);
        return mapper.toDto(savedDepart);
    }
}
