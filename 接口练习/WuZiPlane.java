package com.indi.interfacetest.weapon;

public class WuZiPlane extends Weapon implements Moveable {

	@Override
	public void move() {
		System.out.println("物资飞机在移动");
	}
}
