package com.appllication.development.schoolproject.dto;

import com.appllication.development.schoolproject.model.Department;

//dto class is used to transfer data controller,service except Department class
public class DepartmentDTO {
    private Integer departmentId;
    private String departmentName;
    private String departmentCode;
    private String status;

    public DepartmentDTO(){

    }

    //set values to departmentDTO
    public DepartmentDTO(Department department){
        this.departmentId=department.getDepartmentId();
        this.departmentName=department.getDepartmentName();
        this.departmentCode=department.getDepartmentCode();
        this.status=department.getStatus();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
