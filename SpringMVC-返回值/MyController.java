package com.emily.controller;

import com.emily.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MyController {
    @RequestMapping(value = "/returnVoid-ajax.do")
    public void returnVoidAjax(HttpServletResponse response,String name, Integer age) throws IOException {
        System.out.println("===returnVoidAjax===,name=" + name +"age=" + age );
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        String json = "";
        if (student != null){
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);
            System.out.println("student转换的json=="+json);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }
    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody
    public Student doStudentJsonObject(String name, Integer age){
        Student student = new Student();
        student.setName("李四同学");
        student.setAge(23);
        return student;
    }
}
