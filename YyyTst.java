package tests;

public class YyyTst {
	
	static {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		System.out.println("B");
		new YyyTst();
		System.out.println("C");
	}
	
	public YyyTst(){
		System.out.println("X");
	}
	
	{
		System.out.println("Y");
	}
	
	static {
		System.out.println("Z");
	}
	

}
