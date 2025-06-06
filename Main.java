package herkansingOop1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("AA-11-BB", "Opel", "Zafira", "Black"));
		cars.add(new Car("CC-22-DD", "Toyota", "Corolla", "White"));
		cars.add(new Car("EE-33-FF", "Ford", "Focus", "Blue"));	
		
		ArrayList<Garage> garage = new ArrayList<>();
		garage.add(new Garage(2));
		garage.add(new Garage(3));
		
		ArrayList<License> licenses = new ArrayList<>();
		licenses.add(new License(cars.get(0), garage.get(0).GetId()));
		licenses.add(new License(cars.get(1), garage.get(0).GetId()));
		licenses.add(new License(cars.get(2), garage.get(1).GetId()));
	}

}
