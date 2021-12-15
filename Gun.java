package app;

public class Gun extends Weapon {

	public void fireWeapon(int power) {

		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}

	public void fireWeapon() {

		System.out.println("In overloaded Bomb.fireWeapon()");
		super.fireWeapon(10);
	}

	public void activate(boolean enable) {

		System.out.println("In the Gun.activate() with and enable of " + enable);
	}

}// Gun Class
