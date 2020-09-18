package com.indi.multithreading.emilytest;

public class Test {

	public static void main(String[] args) {
		Annimal a = new Annimal();
		a.move();
		
		Cat c = new Cat();
		c.move();
		
		Bird b = new Bird();
		b.move();
		
		Annimal x = new Cat();
		x.move();
		
		Annimal y = new Cat();
		Cat y1 = (Cat)y;
		y1.catchMouse();
		
		Annimal z = new Bird();
		if(z instanceof Cat) {
			Cat z1 = (Cat)z;
			z1.catchMouse();
		}
		else if(z instanceof Bird){
			Bird z1 = (Bird)z;
			z1.fly();
		}
	}

}
