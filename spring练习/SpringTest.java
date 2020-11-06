package com.emily;

import com.emily.service.SomeService;
import com.emily.service.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.util.Date;

public class SpringTest {
    @Test
    public void testdosome(){
        SomeService ss = new SomeServiceImpl();
        ss.dosome();
    }
    @Test
    public void testdosomeSpring(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService)ac.getBean("someservice");
        service.dosome();
    }
    @Test
    public void testSpringCountAndName(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量为" + nums);
        String names[] = ac.getBeanDefinitionNames();
        for (String name : names){
            System.out.println("各对象的name为"+name);
        }
    }
    @Test
    public void testDate(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ac.getBean("mydate");
        System.out.println("date=" + date);
    }
}
