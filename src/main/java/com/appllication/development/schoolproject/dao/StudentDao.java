package com.appllication.development.schoolproject.dao;

import com.appllication.development.schoolproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Data access object
@Repository//make interface as repository
//without this dao it cant be access data without jpa
public interface StudentDao extends JpaRepository<Student, Integer> {
    Student findByStudentId(Integer studentId);
    List<Student> findAllByDistrict(String district);

    void deleteStudentByStudentId(Integer studentId);
}
