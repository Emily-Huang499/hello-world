package thirdc;

import java.lang.reflect.Method;

public class RefCallUnpub {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.name);
    }
}

class Person {
    String name;
    private void setName(String name) {
        this.name = name;
    }
}

