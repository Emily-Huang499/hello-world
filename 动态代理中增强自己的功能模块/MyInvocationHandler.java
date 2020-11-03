package com.emily.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        res = method.invoke(target,args);
        if (res != null){
            Integer num = (Integer)res;
            num = num * 2;
            res = num;
        }
        return res;
    }
}
