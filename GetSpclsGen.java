package fifthc;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GetSpclsGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<IntPair> clazz = IntPair.class;
		Type t = clazz.getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) t;
			Type[] types = pt.getActualTypeArguments();
			Type firstType = types[0];
			Class<?> typeClass = (Class<?>) firstType;
			System.out.println(typeClass);
		}
	}
}

class Pair<T>{
	private T first;
	private T last;
	public Pair(T first, T last) {
		this.first = first;
		this.last = last;
	}
	public T getFirst() {
		return first;
	}
	public T getLast() {
		return last;
	}
}

class IntPair extends Pair<Integer>{
	public IntPair(Integer firdt, Integer last) {
		super(first, last);
	}
}
