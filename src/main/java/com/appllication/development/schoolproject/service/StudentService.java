package com.appllication.development.schoolproject.service;

import com.appllication.development.schoolproject.dao.DepartmentDao;
import com.appllication.development.schoolproject.dao.StudentDao;
import com.appllication.development.schoolproject.dto.StudentDTO;
import com.appllication.development.schoolproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    // StudentDao interface autowired in service bean
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private DepartmentDao departmentDao;
    public List<StudentDTO> getAllStudents(){
        List<Student> students = this.studentDao.findAll();

        List<StudentDTO> studentDTOs=new ArrayList<>();
        for(Student student:students){
            StudentDTO studentDTO=new StudentDTO(student);
            //pass student object to StudentDTO constructor and assign it studentDTO object
            studentDTOs.add(studentDTO);//ass studentDTO objects to studentDTOs list
        }
        return studentDTOs;
    }
    public StudentDTO addStudent(StudentDTO studentDTO){

        Student student=new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setDistrict(studentDTO.getDistrict());
        student.setDepartment(this.departmentDao.getReferenceById(studentDTO.getDepartmentId()));

        student=this.studentDao.saveAndFlush(student);
        return new StudentDTO(student);
    }

    public StudentDTO getStudentById(Integer studentId){
        Student student=this.studentDao.findByStudentId(studentId);
        return new StudentDTO(student);
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
