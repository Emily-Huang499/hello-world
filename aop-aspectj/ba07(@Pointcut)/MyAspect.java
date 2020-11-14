package com.emily.ba07;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @After(value = "mypc()")
    public void doAfter(){
        System.out.println("执行最终通知，总是会被执行的代码");
    }
    @Before(value = "mypc()")
    public void myBefore(){
        System.out.println("前置通知，在目标方法执行之前先执行的");
    }
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    private void mypc(){
    }
}
