package thirdc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
				System.out.println(method);
				if (method.getName().equals("morning")) {
					System.out.println("Good morning, " + args[0]);
				}
				return null;
			}
		};
		Hello hello = (Hello) Proxy.newProxyInstance(
				Hello.class.getClassLoader(),
				new Class[] {Hello.class},
				handler);
		hello.morning("Bob");
	}
}

interface Hello{
	void morning(String name);
}
