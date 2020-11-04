package com.emily;

import com.emily.domain.Student;
import com.emily.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp2 {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.emily.dao.StudentDao" + "." +"selectStudents";
        List<Student> studentList = sqlSession.selectList(sqlId);
        for (Student stu : studentList){
            System.out.println("查询的学生=" + stu);
        }
        sqlSession.close();
    }
}
