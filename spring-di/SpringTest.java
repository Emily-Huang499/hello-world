package com.emily;

import com.emily.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu1 = (Student) ac.getBean("mystudent");
        System.out.println("student对象信息set注入后为" + stu1);
    }
}
