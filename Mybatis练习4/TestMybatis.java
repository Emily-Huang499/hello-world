package com.emily;

import com.emily.dao.StudentDao;
import com.emily.domain.MyStudent;
import com.emily.domain.Student;
import com.emily.util.MyBatisUtils;
import com.emily.vo.QueryParam;
import com.emily.vo.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {

    @Test
    public void testReturnViewStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        ViewStudent student = dao.selectReturnViewStudent(1001);
        System.out.println("student==" + student);
    }
    @Test
    public void testCountStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int nums = dao.countStudent();
        System.out.println("student总数为" + nums);
    }
    @Test
    public void testSelectStudentMap() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<Object,Object> map = dao.selectMapById(1004);
        System.out.println("map==" + map);
    }
    @Test
    public void testSelectAllStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students =  dao.selectAllStudents();
        for (Student stu : students){
            System.out.println("使用resultMap获取到的学生信息为" + stu);
        }
    }
    @Test
    public void testSelectMyStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = dao.selectMyStudent();
        for (MyStudent mystu: students){
            System.out.println("MyStudent==" + mystu);
        }
    }

    @Test
    public void testSelectDiffColProperty(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = dao.selectDiffColProperty();
        for (MyStudent mystu: students){
            System.out.println("MyStudent==" + mystu);
        }
    }
    @Test
    public void testSelectLikeOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String name = "%n%";
        List<Student> students = dao.selectLikeOne(name);
        for (Student mystu: students){
            System.out.println("MyStudent==" + mystu);
        }
    }
    @Test
    public void testSelectLikeTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String name = "i";
        List<Student> students = dao.selectLikeTwo(name);
        for (Student mystu: students){
            System.out.println("MyStudent==" + mystu);
        }
    }
}
