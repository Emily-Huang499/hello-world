package com.emily;

import com.emily.dao.StudentDao;
import com.emily.domain.Student;
import com.emily.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test

    public void testSelectStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students =  dao.selectStudents();
        for (Student stu : students){
            System.out.println(stu);
        }
    }

    @Test
    public void testInsetStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1005);
        student.setName("美人瑜");
        student.setEmail("mry@163.com");
        student.setAge(18);
        int nums = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("添加的对象有" + nums);
    }
    @Test
    public void testUpdateStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        int nums = dao.updateStudent(student);
        sqlSession.commit();
        System.out.println("修改的对象有" + nums);
    }
}
