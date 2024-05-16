package com.appllication.development.schoolproject.service;

import com.appllication.development.schoolproject.dto.StudentDTO;
import com.appllication.development.schoolproject.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest   {

    @Autowired
    private StudentService studentService;

    @Test
    void getAllStudents() {
       this.studentService.getAllStudents();
    }

    @Test
    void addStudent() {
        StudentDTO student=new StudentDTO();
        student.setFirstName("Pasindu");
        student.setLastName("Chamara");
        student.setDistrict("Kandy");

        studentService.addStudent(student);
    }

    @Test
    void getStudentByID() {
        this.studentService.getStudentById(8);
    }

    @Test
    void getStudentByDistrict() {
        this.studentService.getStudentByDistrict("Matara");
    }

    @Test
    void deleteStudent() {
        this.studentService.getStudentById(10);
    }
}