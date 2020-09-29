package com.indi.interfacetest.weapon;

public class GaoShePao extends Weapon implements Shootable{

	@Override
	public void shoot() {
		System.out.println("高射炮在射击");
	}

}
