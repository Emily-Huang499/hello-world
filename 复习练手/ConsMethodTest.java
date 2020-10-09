public class ConsMethodTest {
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("XiaoMing");
        ming.setAge(18);
        hong.setNameAge("XiaoHong",19);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
        System.out.println(hong.getName() +" " + hong.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNameAge(String name, int age){
        this.name = name;
        this.age = age;
    }
}
