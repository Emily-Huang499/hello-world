package com.indi.interfacetest.weapon;

public class Tank extends Weapon implements Moveable,Shootable{

	@Override
	public void move() {
		System.out.println("坦克在移动");
	}
	
	@Override
	public void shoot() {
		System.out.println("坦克在开炮");
	}
}
