package com.emily.controller;

import com.emily.domain.Student;
import com.emily.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService service;
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){

        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int nums = service.addStudent(student);
        if (nums>0){
            tips = "学生【"+student.getName()+"】注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent(){
        List<Student> students = service.findStudents();
        return students;
    }
}
