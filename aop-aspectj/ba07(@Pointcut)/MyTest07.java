package com.emily;

import com.emily.ba07.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doThird();
    }
}
