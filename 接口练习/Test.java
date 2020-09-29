package com.indi.interfacetest.weapon;

public class Test {
	public static void main(String[] args) {
		Army army = new Army(4);
		
		Fighter fighter = new Fighter();
		Tank tank = new Tank();
		GaoShePao gaoshepao = new GaoShePao();
		WuZiPlane wuziplane = new WuZiPlane();
		
		try {
			army.addWeapon(fighter);
			army.addWeapon(tank);
			army.addWeapon(gaoshepao);
			army.addWeapon(wuziplane);
		}catch (AddWeaponException e) {
			System.out.println(e.getMessage());
		}
		
		army.attackAll();
		
		army.moveAll();
	}
}
