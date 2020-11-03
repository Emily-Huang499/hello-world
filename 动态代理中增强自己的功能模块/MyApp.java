package com.emily;

import com.emily.handler.MyInvocationHandler;
import com.emily.service.GoNeng;
import com.emily.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        GoNeng gn = new GoNeng();
        int num = gn.print("销售部门");
        System.out.println("num=" + num);

        GoNeng gn2 = new GoNeng();
        InvocationHandler handler = new MyInvocationHandler(gn2);
        HelloService proxy =(HelloService) Proxy.newProxyInstance(gn2.getClass().getClassLoader(),
                               gn2.getClass().getInterfaces(),
                               handler);
        int num2 = proxy.print("人事部门");
        System.out.println("动态代理增加的功能代码");
        System.out.println("num改变之后的值为====" + num2);
    }
}
