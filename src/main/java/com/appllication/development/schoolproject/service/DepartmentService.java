package com.appllication.development.schoolproject.service;

import com.appllication.development.schoolproject.dao.DepartmentDao;
import com.appllication.development.schoolproject.dto.DepartmentDTO;
import com.appllication.development.schoolproject.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

//    public List<Department> getAllDepartments(){
//        List<Department> departments=this.departmentDao.findAll();
//        return departments;
//    }

    public List<DepartmentDTO> getAllDepartments(){
        List<Department> departments=this.departmentDao.findAll();

        List<DepartmentDTO> departmentDTOS=new ArrayList<>();

        for(Department department:departments){
            //after value addition assign to departmentDTO
            DepartmentDTO departmentDTO=new DepartmentDTO(department);

            departmentDTOS.add(departmentDTO);
        }
        return departmentDTOS;
    }
//    public Department addDepartment(Department department){
//        Department newDepartment=this.departmentDao.saveAndFlush(department);
//        return newDepartment;
//    }

     public DepartmentDTO addDepartment(DepartmentDTO departmentDTO){
        Department department=new Department();

        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setDepartmentCode(departmentDTO.getDepartmentCode());
        department.setStatus(department.getStatus());

        department=this.departmentDao.saveAndFlush(department);
        return new DepartmentDTO(department);
    }

    public DepartmentDTO getDepartmentById(Integer departmentId){
        Department department=this.departmentDao.findByDepartmentId(departmentId);
        return new DepartmentDTO(department);
    }
}
