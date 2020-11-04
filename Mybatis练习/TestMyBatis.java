package com.emily;

import com.emily.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {
    @Test
    public void testInsert() throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.emily.dao.StudentDao" + "." +"insertStudent";
        Student stu = new Student();
        stu.setId(1004);
        stu.setName("Kris");
        stu.setEmail("Kris@163.com");
        stu.setAge(30);
        int nums = sqlSession.insert(sqlId,stu);
        sqlSession.commit();
        System.out.println("执行insert的结果" + nums);
        sqlSession.close();
    }
}
