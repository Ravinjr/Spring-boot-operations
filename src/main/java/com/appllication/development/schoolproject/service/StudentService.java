package com.appllication.development.schoolproject.service;

import com.appllication.development.schoolproject.dao.StudentDao;
import com.appllication.development.schoolproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    // StudentDao interface autowired in service bean
    @Autowired
    private StudentDao studentDao;
    public List<Student> getAllStudents(){
        List<Student> students = this.studentDao.findAll();
        return students;
    }
    public Student addStudent(Student student){
        Student newStudent=this.studentDao.saveAndFlush(student);
        return newStudent;
    }

    public Student getStudentById(Integer studentId){
        return this.studentDao.findByStudentId(studentId);
    }

    public List<Student> getStudentByDistrict(String district){
        List<Student> students= this.studentDao.findAllByDistrict(district);
        return students;
    }

//    public void deleteStudent(Integer studentId){
//        this.studentDao.deleteStudentByStudentId(studentId);
//    }

    public Student updateStudent(Student student){
        Student existingStudent= this.studentDao.saveAndFlush(student);
        return existingStudent;
    }



}
