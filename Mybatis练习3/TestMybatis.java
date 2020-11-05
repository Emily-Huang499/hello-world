package com.emily;

import com.emily.dao.StudentDao;
import com.emily.domain.Student;
import com.emily.util.MyBatisUtils;
import com.emily.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Test
    public void testSelectStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudent(1001);
        System.out.println("查询的学生信息为" + student);
    }
    @Test
    public void testSelectMultiParam(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectMultiParam("Emily",28);
        for (Student stu : students){
            System.out.println("根据多个参数查询的学生信息为" + stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiObject(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        QueryParam param = new QueryParam();
        param.setParamname("美人瑜");
        param.setParamage(30);
        List<Student> students = dao.selectMultiObject(param);
        for (Student stu:students){
            System.out.println("使用param对象传递参数的结果为" + stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiPosition(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectMultiPosition(1001,18);
        for (Student stu:students){
            System.out.println("使用位置获取参数得到的结果为" + stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiMap(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<String,Object> data = new HashMap<>();
        data.put("myname","Johnny");
        data.put("myage",20);
        List<Student> students = dao.selectMultiMap(data);
        for (Student stu:students){
            System.out.println("使用Map传参得到的结果为" + stu);
        }
        sqlSession.close();
    }
}
