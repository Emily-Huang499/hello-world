package com.indi.interfacetest.weapon;

public class Army {
	private Weapon[] weapons;

	public Army(int count) {
		weapons = new Weapon[count];
	}

	public void addWeapon(Weapon weapon) throws AddWeaponException {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] == null) {
				weapons[i] = weapon;
				return;
			}
		}
		throw new AddWeaponException("武器数量已达到上限");
	}

	public void attackAll() {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Shootable) {
				Shootable shootable = (Shootable) weapons[i];
				shootable.shoot();
			}
		}
	}

	public void moveAll() {
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Moveable) {
				Moveable moveable = (Moveable) weapons[i];
				moveable.move();
			}
		}
	}
}
