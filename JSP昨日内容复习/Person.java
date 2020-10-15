package bjpowernode.controller;

public class Person {
    private String name;
    private String sex;
    private int age;
    private int idCard;

    public Person() {
    }

    public Person(String name, String sex, int age, int idCard) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
}
