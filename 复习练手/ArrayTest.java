public class ArrayTest {
    public static void main(String[] args) {
        Person p = new Person();
        String[] fullname = new String[] { "Emily", "Angela" };
        p.setName(fullname); 
        System.out.println(p.getName()); 
        fullname[0] = "Kris"; 
        System.out.println(p.getName()); 
    }
}

class Person {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }
    public void setName(String[] name) {
        this.name = name;
    }
}

