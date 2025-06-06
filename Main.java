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
				
			 case 2:
                 System.out.println("Beschikbare garages:");
                 for (Garage g : garage) {
                     System.out.printf("Garage ID %d (max capaciteit %d)\n", g.GetId(), g.maxCapacity);
                 }
                 System.out.print("Kies garage ID: ");
                 int garageId = scanner.nextInt();
                 scanner.nextLine();
                 selectedGarage = null;
                 for (Garage g : garage) {
                     if (g.GetId() == garageId) {
                         selectedGarage = g;
                         break;
                     }
                 }
                 if (selectedGarage != null) {
                     System.out.println("Je hebt garage geselecteerd: " + selectedGarage.GetId());
                 } else {
                     System.out.println("Garage niet gevonden.");
                 }
                 break;
                 
			 case 3:
                 if (selectedCar == null || selectedGarage == null) {
                     System.out.println("Selecteer eerst een auto en een garage.");
                     break;
                 }
                 License licenseToUse = null;
                 for (License l : licenses) {
                     if (l.GetLicenseHolderPlate().equals(selectedCar.GetLicensePlate())) {
                         licenseToUse = l;
                         break;
                     }
                 }
                 if (licenseToUse == null) {
                     System.out.println("Geen geldige parkeervergunning gevonden voor deze auto.");
                     break;
                 }
                 boolean geparkeerd = selectedGarage.ParkCar(selectedCar, licenseToUse);
                 if (geparkeerd) {
                     System.out.println("Auto succesvol geparkeerd.");
                 } else {
                     System.out.println("Auto kon niet geparkeerd worden (vol, verkeerde garage of vergunning).");
                 }
                 break;
			}
		}
	}

}
