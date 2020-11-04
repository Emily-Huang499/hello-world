package com.emily.dao;

import com.emily.domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudents();
    public int insertStudent(Student student);
}
