package fifthc;

public class NoGenCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String> p1 = new Pair<>("Hello", "world") ;
		Pair<Integer> p2 = new Pair<>(123, 456);
		Class c1 = p1.getClass();
		Class c2 = p2.getClass();
		System.out.println(c1 == c2);
		System.out.println(c1 == Pair.class);
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