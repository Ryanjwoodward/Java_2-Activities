package app;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bomb tnt = new Bomb();
		Gun kar98k = new Gun();
		tnt.activate(true);
		kar98k.activate(true);
		tnt.fireWeapon(10);
		kar98k.fireWeapon(100);
		tnt.fireWeapon();
		kar98k.fireWeapon();
	}

}
