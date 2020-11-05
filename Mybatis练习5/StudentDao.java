package com.emily.dao2;

import com.emily.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudentIf(Student student);
    List<Student> selectStudentWhere(Student student);
    List<Student> selectStudentForEach(List<Integer> list);
    List<Student> selectStudentForeachTwo(List<Student> stulist);
    List<Student> selectStudentForeachThree(List<Student> slist);
    List<Student> selectByPageHelper();
}
