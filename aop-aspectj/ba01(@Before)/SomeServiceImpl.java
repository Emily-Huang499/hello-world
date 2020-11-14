package com.emily.ba01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("=====执行目标对象的doSome方法=====");
    }
}
