package com.emily.ba06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void doAfter(){
        System.out.println("执行最终通知，总是会被执行的代码");
    }
}
