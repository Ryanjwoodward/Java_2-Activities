/**
 * 
 */
package app;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Ryan Woodward
 
 */
public class DemoJsonFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car[] cars = new Car[5];
		cars[0] = new Car(1943,"Volkswagen", "Kubelwagen", 999999, 2.5d);
		cars[1] = new Car(1943,"DaimierBenz", "Panther", 500, 430.0d);
		cars[2] = new Car(1943,"Krupp", "Sturmgeshutz", 900, 2.5d);
		cars[3] = new Car(1944,"BohmischMahrische", "Hetzer", 650, 320.0d);
		cars[4] = new Car(1944,"Henschel", "KonigTiger", 568, 860.0d);
		
		for(int x=0; x<4; ++x) {
			
			saveToFile("out.json", cars[x], true);
		}
		
		ArrayList<Car> carsList = readFromFile("out.json");
		
		for(Car car: carsList) {
			
			String text = Integer.toString(car.get_year()) + "." +
						car.get_make() + "." +
						car.get_model() + "." +
						Integer.toString(car.get_odometer()) + "." +
						Double.toString(car.get_engineLiters());
					
			System.out.println("HERE: " + text);
		}
		
	}
	
	private static void saveToFile(String fileName, Car car, boolean append) {
		
		PrintWriter pw;
		
		try {
			
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);
			
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(car);
			pw.println(json);
			
			pw.close();
		
		}catch(IOException e) {
			
			
			e.printStackTrace();
		}
		
	}//saveToFile
		
		
		
		
	private static ArrayList<Car> readFromFile(String fileName){
		
		ArrayList<Car> cars = new ArrayList<Car>();
		
		try {
			
			File file = new File(fileName);
			Scanner s = new Scanner(file);
			
			while(s.hasNext()) {
				
				String json = s.nextLine();
				ObjectMapper objectMapper = new ObjectMapper();
				Car car = objectMapper.readValue(json, Car.class);
				cars.add(car);
				
			}
			
			s.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
		return cars;
	}//readFile
		
	

}//DemoJsonFiles Class
