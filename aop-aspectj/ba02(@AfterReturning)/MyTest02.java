package com.emily;

import com.emily.ba02.SomeService;
import com.emily.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doOther("Amy",17);
        Student str = proxy.doOther2("美人鱼",18);
        System.out.println("student===" + str);
    }
}
