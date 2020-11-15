package com.emily;

import com.emily.domain.Student;
import com.emily.service.StudentService;
import com.emily.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String names[] = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中的对象名称==" + name);
        }
    }

    @Test
    public void testInsertStudent() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(1006);
        student.setName("鲁班七号");
        student.setEmail("lulu@163.com");
        student.setAge(8);
        int nums = service.addStudent(student);
        System.out.println("nums==" + nums);
    }
    @Test
    public void serviceSelectStudents() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> studentList = (List<Student>) service.queryStudents();
        for (Student student:studentList){
            System.out.println(student);
        }
    }
}
