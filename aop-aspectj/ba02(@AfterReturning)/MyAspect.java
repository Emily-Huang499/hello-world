package com.emily.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(Object res){
        System.out.println("后置通知，在目标方法之后执行的，获取的返回值是："+ res);
    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))",returning = "res")
    public void myAfterReturning2(Object res){
        System.out.println("后置通知，在目标方法之后执行的，获取的返回值是："+ res);
        if (res != null){
            res = "1111";
        }
    }
}
