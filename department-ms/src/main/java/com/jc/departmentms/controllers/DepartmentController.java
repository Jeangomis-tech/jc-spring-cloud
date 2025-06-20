package com.jc.departmentms.controllers;

import com.jc.departmentms.dtos.DepartmentDto;
import com.jc.departmentms.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor

public class DepartmentController {
    private final  DepartmentService departmentService;

    @GetMapping("{code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable String code) {
        return new ResponseEntity<DepartmentDto>(
                departmentService.getDepartmentByCode(code), HttpStatus.OK
        );
    }
    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        return new ResponseEntity<>(departmentService.createDepartment(departmentDto), HttpStatus.CREATED);
    }
}
