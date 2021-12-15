package app;

public class Bomb implements WeaponInterface {

	@Override
	public void fireWeapon(int power) {

		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}

	@Override
	public void fireWeapon() {
		
		System.out.println("In overloaded Bomb.fireWeapon()");
	}
	
	@Override
	public void activate(boolean enable) {
		
		System.out.println("In the Bomb.activate() with and enable of " + enable);
	}

}//Bomb Class
