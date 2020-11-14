package com.emily.ba02;

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
    public Student doOther2(String name, Integer age) {
        Student student = new Student();
        student.setName("Lucy");
        student.setAge(19);
        return student;
    }
}
