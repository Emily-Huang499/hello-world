```java
public class birth{
    public static void main(String[] args){
        Person ming=new Person();
        ming.setBirth(2008);
        System.out.println(ming.getAge());     
    }
}

class Person{
    private String name;
    private int birth;
    public void setBirth(int birth){
        this.birth=birth;
    }
    public int getAge(){
        return calcAge(2020);
    }
    private int calcAge(int currentYear){
        return currentYear - this.birth;
    }
}
```

