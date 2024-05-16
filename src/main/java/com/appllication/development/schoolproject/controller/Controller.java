package com.appllication.development.schoolproject.controller;

import com.appllication.development.schoolproject.dto.StudentDTO;
import com.appllication.development.schoolproject.model.Student;
import com.appllication.development.schoolproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//localhost:8080/students/getAllStudents

@RestController
@RequestMapping("/students")
public class Controller {
    @Autowired
    private StudentService studentService;
    //The data going away from the project so it is send after wrapped on responseEntity object
    @RequestMapping(value = "/getAllStudents",method = RequestMethod.GET)
    public ResponseEntity<List<StudentDTO>> getAllStudents(){
        List<StudentDTO> students=this.studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);

    }

    // save new student in backend from postman
    // It should post the student to backend which entered from frontend
    // by requestPost method
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO){
        StudentDTO newStudent=this.studentService.addStudent(studentDTO);
        return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
    }

    // get student by ID
    @RequestMapping(value = "/getStudentById/{studentId}",method = RequestMethod.GET)
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Integer studentId){
        StudentDTO student=this.studentService.getStudentById(studentId);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @RequestMapping(value ="/getStudentByDistrict/{district}",method =RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudentByDistrict(@PathVariable String district){
        List<Student> students=this.studentService.getStudentByDistrict(district);
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.PUT)
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        Student existingStudent=this.studentService.updateStudent(student);
        return new ResponseEntity<>(existingStudent,HttpStatus.OK);
    }

}
