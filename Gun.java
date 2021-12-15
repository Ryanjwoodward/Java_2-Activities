package app;

public class Gun implements WeaponInterface {

	@Override
	public void fireWeapon(int power) {

		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}

	@Override
	public void fireWeapon() {

		System.out.println("In overloaded Bomb.fireWeapon()");
	}

	@Override
	public void activate(boolean enable) {

		System.out.println("In the Gun.activate() with and enable of " + enable);
	}

}// Gun Class
