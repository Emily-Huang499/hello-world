package com.emily;

import com.emily.dao.StudentDao;
import com.emily.dao.impl.StudentDaoImpl;
import com.emily.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test

    public void testSelectStudents(){
        StudentDao dao = new StudentDaoImpl();
        List<Student> students =  dao.selectStudents();
        for (Student stu : students){
            System.out.println(stu);
        }
    }

}
