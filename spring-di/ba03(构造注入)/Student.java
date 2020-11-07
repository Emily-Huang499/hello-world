package com.emily.ba03;

public class Student {
    private String name;
    private Integer age;

    private School school;

    public Student(String stuname, Integer stuage, School stuschool) {
        this.name = stuname;
        this.age = stuage;
        this.school = stuschool;
    }

    public void setName(String name) {
        System.out.println("setName:" + name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
