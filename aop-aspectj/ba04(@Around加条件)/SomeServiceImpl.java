package com.emily.ba04;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("=====执行目标对象的doSome方法=====");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("=====执行目标对象的doOther方法=====");
        return "abcd";
    }

    @Override
    public String doFirst(String name,Integer age) {
        System.out.println("======业务方法doFirst=====");
        return "doFirst";
    }
}
