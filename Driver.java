//Author: Ryan Woodward
//Class: CST-239
//Date: 9/10/2021

//Notes:
//1- In the carCreationMenu Method, add error checking to prevent invalid input from user
//2 - Commented our the custom car beginning due to stack overflow error.

package game;

import racecar.Racecar;
import java.util.Scanner;

public class Driver {

	private static int _userSelection;
	private static Scanner scan = new Scanner(System.in);
	private static Racecar raceCar;

	public static void carCreationMenu() {

		int engineNum, tirePressure, designationNum, racingNum;

		do {
			System.out.println(
					"\t    Welcome to the Racecar creation menu\n\t-------------------------------------------");
			//System.out.println("\t 1.) Create a Default Racecar \n\t 2.) Create Custom Racecar\n");

			//_userSelection = scan.nextInt();
			_userSelection = 1;

			if (_userSelection == 1) {

				System.out.println("\n\t Creating you a 'default' racecar...\n\n");
				raceCar = new Racecar();

			} else if (_userSelection == 2) {

				// I should add error checking here for invalid user entries---------------
				System.out.println("\t Enter your vehicles 'Engine Number': ");
				engineNum = scan.nextInt();

				System.out.println("\t Enter your vehicles required 'Tire Pressure': ");
				tirePressure = scan.nextInt();

				System.out.println("\t Enter your vehicles 'Designation Number': ");
				designationNum = scan.nextInt();

				System.out.println("\t Enter your vehicles 'Racing Number': ");
				racingNum = scan.nextInt();

				System.out.println("\n\t Creating your 'custom' racecar...\n\n");
				raceCar = new Racecar(engineNum, tirePressure, designationNum, racingNum);

			} else {

				System.out.println("\tERROR: Restarting menu.....\n\n");
				_userSelection = 0;
			}

		} while (_userSelection == 0);

	}// carCreationMenu Method

	public static void optionsMenu() {

		do {
			System.out.println("   \tWhat would you like to do?\n   ---------------------------------------");
			System.out.println(
					"\t 1.) Check vehicle status \n\t 2.) Start or Stop Engine \n\t 3.) Change your speed \n\t 4.)EXIT the program");
			System.out.println("\n\t Enter a value 1 - 4");

			_userSelection = scan.nextInt();

			if (_userSelection < 1 || _userSelection > 4) {

				System.out.println("\tERROR: incorrect value entered. Starting Over\n\n");
				_userSelection = 0;

			} else if (_userSelection == 1) {// Status Menu (attributes)

				System.out.println("directing to Status Menu...\n");
				statusMenu();

			} else if (_userSelection == 2) {// Start and stop the car

				do {
					System.out.print("Your car is currently ");
					if (raceCar.get_engine().get_running()) {

						System.out.println("running. Would you like to turn it off?");
					} else {

						System.out.println("off. Would you like to start it up?");
					}

					System.out.println("\t 1= Turn On Engine, 2= Turn Off Engine");
					_userSelection = scan.nextInt();

					if (_userSelection < 1 || _userSelection > 2) {

						System.out.println("ERROR: incorrect value entered. returning...\n");
						_userSelection = 0;
					} else if (_userSelection == 1) {

						if (raceCar.getTirePressure() < 32) {

							System.out.println("\tThe tire pressure is too low to start!");
							System.out.println("\t Go to Status Menu to fill them.");
							System.out.println("Returning to options Menu...");
							optionsMenu();
						} else {

							System.out.println("\n\t Turning Engine On...");
							raceCar.get_engine().startEngine();

							System.out.println("\tReturning to Options Menu...\n");
							optionsMenu();
						}

					} else if (_userSelection == 2) {

						System.out.println("\n\t Turning Engine Off...");
						raceCar.get_engine().stopEngine();

						System.out.println("\tReturning to Options Menu...\n");
						optionsMenu();
					}

				} while (_userSelection == 0);

			} else if (_userSelection == 3) {//Change the speed of the racecar

				do {
					System.out.println("Your speed is currently: " + raceCar.get_speed() + " mph");
					System.out.println("What would you like to change your speed to?");

					_userSelection = scan.nextInt();

					if (_userSelection > 100) {

						System.out.println("\n\tBOOM! Your car has stopped, it wasnt meant to got that fast!\n");
						raceCar.get_engine().stopEngine();

						System.out.println("\tReturning to Options Menu...");
						optionsMenu();

					} else if (_userSelection < 100 && _userSelection > 0) {

						System.out.println("\tAdjusting speed to " + _userSelection + " mph...");
						raceCar.set_speed(_userSelection);
						System.out.println("\tYour car is now at " + raceCar.get_speed() + " mph");
						System.out.println("\tReturning to Options Menu...\n");
						optionsMenu();

					} else if (_userSelection < 0) {

						System.out.println("\n\tERROR: Incorrect value inputted. Restarting...");
					}

				} while (_userSelection == 0);

			} else if (_userSelection == 4) {

				System.out.println("Exiting program. Auf Widersehen!");
				_userSelection = 1;
			}

		} while (_userSelection == 0);
	}// optionsMenu Method

	public static void statusMenu() {
		
		do {
		System.out.println("\t    Status menu\n\t------------------------");
		System.out.println("\t 1.) Display Car's status\n\t 2.) Adjust Car's status"
				+ "\n\t 3.) RETURN to Options Menu\n\t 4.) EXIT program");
		
		_userSelection = scan.nextInt();
		
		if(_userSelection == 1) {
			
			String onOff = "off";
			if(raceCar.get_engine().get_running()) {
				
				onOff = "on";
			}else {
				
				onOff = "off";
			}
			
			System.out.println("\t     Your Racecar's Attributes\n\t------------------------------------");
			System.out.println("\t Engine Number: " + raceCar.get_engine().get_engineNumber() +
					"\n\t Designation Number: " + raceCar.get_designationNum() + "\n\t Racing Number: "
					+ raceCar.get_racingNumber()+ "\n\t Tire Pressure: " + raceCar.getTirePressure() + 
					"\n\t Engine: " + onOff +  "\n\t Current Speed: " + raceCar.get_speed());
			
			System.out.println("\n\tReturning to Status Menu...\n");
			statusMenu();
			
		}else if(_userSelection == 2) {
			
			System.out.println("\n\tWhich Attribute would you like to adjust?\n   --------------------------------------------------------");
			System.out.println("\t 1.) Engine Number\n\t 2.) Designation Number\n\t 3.) Racing Number\n\t 4.) Tire Pressure");
			_userSelection = scan.nextInt();
			
			switch(_userSelection){
			
			case 1:
				System.out.println("\n\tWhat is the new 'Engine Number': ");
				_userSelection = scan.nextInt();
				raceCar.get_engine().set_engineNumber(_userSelection);
				break;
				
			case 2:
				System.out.println("\n\tWhat is the new 'Designation Number': ");
				_userSelection = scan.nextInt();
				raceCar.set_designationNum(_userSelection);
				break;
				
			case 3:
				System.out.println("\n\tWhat is the new 'Racing Number': ");
				_userSelection = scan.nextInt();
				raceCar.set_racingNumber(_userSelection);
				break;
				
			case 4:
				System.out.println("What is the new 'Tire Pressure': ");
				_userSelection = scan.nextInt();
				raceCar.setTirePressure(_userSelection);
				break;
				
			default:
				System.out.println("ERROR: Returning to Status Menu...");
				
			}
			
			statusMenu();
		}else if(_userSelection == 3) {
			
			System.out.println("\n\tReturning to Options Menu...\n");
			optionsMenu();
			
		}else if(_userSelection == 4) {
			System.out.println("EXITING...");
			
		}else {
			System.out.println("ERROR: Incorrect value entered. Restarting...");
			_userSelection = 0;
		}
		
	}while(_userSelection == 0);
	}// statusMenu

	
	
	public static void main(String[] args) {

		carCreationMenu();
		optionsMenu();
		
		

		System.out.println("\n\n\t...END...");
	}//main method

}//Driver Class
