package com.emily;

import com.emily.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.emily.dao.StudentDao" + "." +"selectStudents";
        List<Student> studentList = sqlSession.selectList(sqlId);
//        String json = "{}";
        for (Student stu : studentList){
//            json = JSON.toJSONString(stu);
            System.out.println("查询的学生=" + stu);
        }
        sqlSession.close();
    }
}
