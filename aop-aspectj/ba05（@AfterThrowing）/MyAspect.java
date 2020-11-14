package com.emily.ba05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println("异常通知：方法执行异常时，执行：" + e.getMessage());
    }
}
