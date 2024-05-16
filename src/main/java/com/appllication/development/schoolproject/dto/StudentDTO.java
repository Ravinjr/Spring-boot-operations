package com.appllication.development.schoolproject.dto;

import com.appllication.development.schoolproject.model.Department;
import com.appllication.development.schoolproject.model.Student;

public class StudentDTO {
    public int studentId;
    public String firstName;
    public String lastName;
    public String district;

    private Integer departmentId;
    private String departmentName;

    public StudentDTO(){

    }

    public StudentDTO(Student student){
        this.studentId=student.getStudentId();
        this.firstName=student.getFirstName();
        this.lastName=student.getLastName();
        this.district=student.getDistrict();
        if(student.getDepartment()!= null){
            this.departmentId=student.getDepartment().getDepartmentId();
            this.departmentName=student.getDepartment().getDepartmentName();
        }

    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
}
