package com.emily.dao;

import com.emily.domain.MyStudent;
import com.emily.domain.Student;
import com.emily.vo.QueryParam;
import com.emily.vo.ViewStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {

     ViewStudent selectReturnViewStudent(@Param("sid") Integer id);
     int countStudent();
     Map<Object,Object> selectMapById(Integer id);
     List<Student> selectAllStudents();
     List<MyStudent> selectMyStudent();
     List<MyStudent> selectDiffColProperty();
     List<Student> selectLikeOne(String name);
     List<Student> selectLikeTwo(String name);
}
