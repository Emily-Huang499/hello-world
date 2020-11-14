package com.emily.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间：" + new Date());
        result = pjp.proceed();
        System.out.println("环绕通知：在目标方法之后，输出事务");
        return result;
    }
}
