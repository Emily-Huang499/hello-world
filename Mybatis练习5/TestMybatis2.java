package com.emily;

import com.emily.dao2.StudentDao;
import com.emily.domain.MyStudent;
import com.emily.domain.Student;
import com.emily.util.MyBatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TestMybatis2 {
    @Test
    public void testSelectStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("Emily");
        student.setAge(18);
        List<Student> students =  dao.selectStudentIf(student);
        for (Student stu : students){
            System.out.println("If===" + stu);
        }
    }

    @Test
    public void testSelectStudentWhere(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1002);
        student.setAge(18);
        List<Student> students =  dao.selectStudentWhere(student);
        for (Student stu : students){
            System.out.println("Where===" + stu);
        }
    }

    @Test
    public void testfor(){
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        String sql = "select * from student where id in ";
        int init = 0;
        int len = list.size();

        StringBuilder builder = new StringBuilder("");
        builder.append("(");
        for (Integer i : list){
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length()-1);
        builder.append(")");
        sql = sql + builder.toString();
        System.out.println("sql==" + sql);
    }
    @Test
    public void testSelectStudentForEach(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1003);
        list.add(1005);
        List<Student> students =  dao.selectStudentForEach(list);
        for (Student stu : students){
            System.out.println("ForEach===" + stu);
        }
    }

    @Test
    public void testSelectStudentForEachTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stuList  = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1002);
        stuList.add(s1);

        s1 = new Student();
        s1.setId(1004);
        stuList.add(s1);

        List<Student> students =  dao.selectStudentForeachTwo(stuList);
        for (Student stu : students){
            System.out.println("ForEach===" + stu);
        }
    }
    @Test
    public void testSelectForThree(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> sList = new ArrayList<>();
        Student s1 = new Student();
        s1.setAge(20);
        sList.add(s1);

        s1 = new Student();
        s1.setAge(28);
        sList.add(s1);

        List<Student> students = dao.selectStudentForeachThree(sList);
        for (Student stu: students){
            System.out.println("sql代码复用==" + stu );
        }
    }

    @Test
    public void testSelectByPageHelper(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        PageHelper.startPage(2,2);
        List<Student> students = dao.selectByPageHelper();
        for (Student stu : students){
            System.out.println("pagehelper得到得信息为==" + stu);
        }
    }
}
