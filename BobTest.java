package test;

public class BobTest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p = new Person();
        String bob = "Bob";
        p.setName(bob); 
        System.out.println(p.getName()); 
        bob = "Alice"; 
        System.out.println(p.getName()); 
    }
}

class Person {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
	}
}
