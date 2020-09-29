package com.indi.interfacetest.weapon;

public class Fighter extends Weapon implements Moveable, Shootable {

	@Override
	public void shoot() {
		System.out.println("战斗机在射击");
	}

	@Override
	public void move() {
		System.out.println("战斗机在移动");
	}

}
