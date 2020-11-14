package com.emily.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        String name = "";
        Object args[] = pjp.getArgs();
        if (args != null && args.length>1){
            Object arg = args[0];
            name = (String)arg;
        }

        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间：" + new Date());

        if ("张三".equals(name)){
            result = pjp.proceed();
        }

        System.out.println("环绕通知：在目标方法之后，输出事务");
        return result;
    }
}
