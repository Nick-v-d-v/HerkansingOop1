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

		Car selectedCar = null;
		Garage selectedGarage = null;

		boolean running = true;
		while (running) {
			System.out.println("Kies een optie:");
			System.out.println("1. Selecteer auto");
			System.out.println("2. Selecteer garage");
			System.out.println("3. Parkeer auto");
			System.out.println("4. Haal auto uit garage");
			System.out.println("5. Bekijk vrije plekken garage");
			System.out.println("0. Stoppen");
			System.out.print("Je keuze: ");

			int keuze = scanner.nextInt();
			scanner.nextLine();

			switch (keuze) {
			case 1:
				System.out.println("Beschikbare auto's:");
				for (int i = 0; i < cars.size(); i++) {
					Car c = cars.get(i);
					System.out.printf("%d: %s %s %s (%s)\n", i, c.GetBrand(), c.GetModel(), c.GetColour(), c.GetLicensePlate());
				}
				System.out.print("Kies auto nummer: ");
				int carIndex = scanner.nextInt();
				scanner.nextLine();
				if (carIndex >= 0 && carIndex < cars.size()) {
					selectedCar = cars.get(carIndex);
					System.out.println("Je hebt auto geselecteerd: " + selectedCar.GetLicensePlate());
				} else {
					System.out.println("Ongeldige keuze.");
				}
				break;
			}
		}
	}

}
