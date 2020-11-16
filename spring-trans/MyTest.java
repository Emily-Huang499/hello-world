package com.emily;

import com.emily.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyGoodsService");
        service.buy(1002,100);
    }
}
