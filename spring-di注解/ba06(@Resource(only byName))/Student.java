package com.emily.ba06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "myStudent6")
public class Student {
    @Value(value = "吴六")
    private String name;

    @Value(value = "22")
    private Integer age;

    @Resource(name = "mySchool6")
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
