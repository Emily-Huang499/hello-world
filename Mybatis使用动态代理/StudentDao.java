package com.emily.dao;

import com.emily.domain.Student;

import java.util.List;

public interface StudentDao {
     List<Student> selectStudents();
     int insertStudent(Student student);
     int updateStudent(Student student);
}
