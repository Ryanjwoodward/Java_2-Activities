package app;

public class Game {

	public static void main(String[] args) {
	
		WeaponInterface[] weapons = new WeaponInterface[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun();
		
		for(int idx = 0; idx < weapons.length; idx++) {
			
			fireWeapon(weapons[idx]);
		}
		
	}
	
	private static void fireWeapon(WeaponInterface weapon) {
		
		if(weapon instanceof Bomb)
			System.out.println("------------> I am a Bomb");
		
		weapon.activate(true);
		weapon.fireWeapon(5);
	}

}
