package com.jhonny.cruddemo.dao;

import com.jhonny.cruddemo.entity.Student;

public interface StudentDAO {

    void saveStudent(Student student);
    Student findById(Long id);
}
