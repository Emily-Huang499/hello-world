package com.emily.dao.impl;

import com.emily.dao.StudentDao;
import com.emily.domain.Student;
import com.emily.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sql = "com.emily.dao.StudentDao.selectStudents";
        List<Student> studentList =  sqlSession.selectList(sql);
        sqlSession.close();
        return studentList;
    }
}
