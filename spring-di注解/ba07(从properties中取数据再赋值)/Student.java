package com.emily.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "myStudent7")
public class Student {
    @Value(value = "${myname}")
    private String name;

    @Value(value = "${myage}")
    private Integer age;

    @Resource(name = "mySchool7")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
