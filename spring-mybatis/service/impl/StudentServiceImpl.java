package com.emily.service.impl;

import com.emily.dao.StudentDao;
import com.emily.domain.Student;
import com.emily.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao;

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = dao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = dao.selectStudents();
        return students;
    }
}
