package com.emily.dao;

import com.emily.domain.Student;
import com.emily.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
     List<Student> selectStudents();
     int insertStudent(Student student);
     int updateStudent(Student student);
     Student selectStudent(Integer id);
     List<Student> selectMultiParam(@Param("myname") String name,
                                    @Param("myage") Integer age);
     List<Student> selectMultiObject(QueryParam param);
     List<Student> selectMultiPosition(Integer id,Integer age);
     List<Student> selectMultiMap(Map<String,Object> map);
}
