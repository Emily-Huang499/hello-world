package com.emily.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MySellHandler implements InvocationHandler {
    private Object taget = null;

    public MySellHandler(Object taget) {
        this.taget = taget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        res = method.invoke(taget,args);
        if (res != null){
            Float price = (Float) res;
            price = price + 25;
            res = price;
        }
        System.out.println("淘宝商家给返红包或优惠券");

        return res;
    }
}
