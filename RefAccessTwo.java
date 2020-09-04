package thirdc;

import java.lang.reflect.Field;

public class RefAccessTwo {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Object p = new Person("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value); 
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

