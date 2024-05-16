package com.appllication.development.schoolproject.controller;

import com.appllication.development.schoolproject.dto.DepartmentDTO;
import com.appllication.development.schoolproject.model.Department;
import com.appllication.development.schoolproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    public DepartmentService departmentService;
    @RequestMapping(value = "/getAllDepartments",method = RequestMethod.GET)
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments(){
        List<DepartmentDTO> departments=this.departmentService.getAllDepartments();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
    public ResponseEntity<DepartmentDTO> addDepartment(@RequestBody DepartmentDTO departmentDTO){
        DepartmentDTO newDepartment=this.departmentService.addDepartment(departmentDTO);
        return new ResponseEntity<>(departmentDTO,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/getDepartmentById/{departmentId}",method = RequestMethod.GET)
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable Integer departmentId){
        DepartmentDTO department=this.departmentService.getDepartmentById(departmentId);
        return new ResponseEntity<>(department,HttpStatus.OK);
    }

}

