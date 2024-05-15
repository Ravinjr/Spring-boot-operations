package com.appllication.development.schoolproject.model;

import jakarta.persistence.*;

@Entity
// make department class as entity
@Table(name = "t_department")
//for mapping object with dpt table
public class Department {
    @Id
    //for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //generated automatically
    @Column(name = "DEPARTMENT_ID",nullable = false,updatable = false)
    private Integer departmentId;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "STATUS")
    private String status;

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Column(name = "DEPARTMENT_CODE")
    private String departmentCode;
}
