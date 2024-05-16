package com.appllication.development.schoolproject.dto;

import com.appllication.development.schoolproject.model.Department;
import com.appllication.development.schoolproject.model.Student;

import java.util.ArrayList;
import java.util.List;

//dto class is used to transfer data controller,service except Department class
public class DepartmentDTO {
    private Integer departmentId;
    private String departmentName;
    private String departmentCode;
    private String status;

    private List<StudentDTO> students;

    public DepartmentDTO(){

    }

    //set values to departmentDTO
    public DepartmentDTO(Department department){
        this.departmentId=department.getDepartmentId();
        this.departmentName=department.getDepartmentName();
        this.departmentCode=department.getDepartmentCode();
        this.status=department.getStatus();

        for(Student student: department.getStudents()){
            StudentDTO studentDTO=new StudentDTO(student);
            this.getStudents().add(studentDTO);
        }
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

    public List<StudentDTO> getStudents() {
        //if there is no students to get away getting null point exception
        if (students==null){
            this.students=new ArrayList<>();
        }
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }
}
