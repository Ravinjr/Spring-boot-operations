package com.appllication.development.schoolproject.dao;

import com.appllication.development.schoolproject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer>{

    Department findByDepartmentId(Integer departmentId);


}
