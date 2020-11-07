package com.emily;

import com.emily.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class SpringTest3 {
    @Test
    public void test01() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("mystudent");
        System.out.println("使用constructor-args属性===" + student);
    }

    @Test
    public void test02() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("mystudent2");
        System.out.println("使用constructor-args属性===" + student);
    }

    @Test
    public void test03() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        File file = (File) ac.getBean("myfile");
        System.out.println("构造注入创建文件对象:myfile===" + file.getName());
    }
}
