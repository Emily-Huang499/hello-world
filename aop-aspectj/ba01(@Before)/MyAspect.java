package com.emily.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;
@Aspect
public class MyAspect {
//    @Before(value = "execution(public void com.emily.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
//    }

@Before(value = "execution(void com.emily.ba01.SomeServiceImpl.doSome(String,Integer))")
public void myBefore(JoinPoint jp){
    System.out.println("方法的签名（定义）==" + jp.getSignature());
    System.out.println("方法的名称==" + jp.getSignature().getName());

    Object args[] = jp.getArgs();
    for (Object arg : args){
        System.out.println("方法的参数=="+ arg);
    }
    System.out.println("1=====前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
}

//    @Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        System.out.println("2=====前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
//    }

//    @Before(value = "execution(* *..SomeServiceImpl.do*(..))")
//    public void myBefore(){
//        System.out.println("3=====前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
//    }
//
//    @Before(value = "execution(* do*(..))")
//    public void myBefore2(){
//        System.out.println("4=====前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
//    }
}
