package com.jc.departmentms.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String code;
}
