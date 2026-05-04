package com.jhonny.cruddemo.dao;

import com.jhonny.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void saveStudent(Student student);
    Student findById(Long id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student student);
    void delete(Integer id);
    int deleteAll();
}
