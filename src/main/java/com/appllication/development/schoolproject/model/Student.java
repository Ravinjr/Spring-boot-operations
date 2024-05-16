package com.appllication.development.schoolproject.model;

import jakarta.persistence.*;

@Entity//make the object as entity because it should interact with db
@Table(name = "t_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//for auto generation
    @Column(name = "STUDENT_ID",nullable = false,updatable = false)
    public int studentId;

    @Column(name = "FIRST_NAME")
    public String firstName;

    @Column(name = "LAST_NAME")
    public String lastName;

    @Column(name = "DISTRICT")
    public String district;

    @ManyToOne(fetch = FetchType.LAZY)
    // relationship with department database from student table
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
