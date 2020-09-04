package thirdc;

import java.lang.reflect.Field;

public class RefAccessThree {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Person p = new Person("Xiao Ming");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "Xiao Hong");
        System.out.println(p.getName());
    }
}
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


