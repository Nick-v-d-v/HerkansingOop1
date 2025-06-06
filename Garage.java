package herkansingOop1;

import java.util.ArrayList;

public class Garage {
	public static int uniqueId = 0;
	public ArrayList<Car> parkedCars;
	public int id;
	public int maxCapacity;

	public Garage(int maxCapacity) {
		uniqueId++;
		this.id = uniqueId;
		this.maxCapacity = maxCapacity;
		this.parkedCars = new ArrayList<Car>();
	}

	public boolean CheckIfValid(Car car, License license) {
		if (parkedCars.size() >= maxCapacity) {
			return false;
		}
		if (!license.GetLicenseHolderPlate().equals(car.GetLicensePlate())) {
			return false;
		}
		if (license.GetValidInGarageId() != this.id) {
			return false;
		}
		return true;
	}

	public boolean ParkCar(Car car, License license) {
		if (CheckIfValid(car, license)) {
			parkedCars.add(car);
			return true;
		}
		return false;
	}
	
	public void UnparkCar(Car car) {
		if (parkedCars.contains(car)) {
			parkedCars.remove(car);
		}
	}
	
	public int GetId() {
		return id;
	}
	
	public int GetCapacity() {
		return parkedCars.size();
	}
	
	public Car GetCarByLicense(String license) {
		for (Car car : parkedCars) {
			if (car.GetLicensePlate().equals(license)) {
				return car;
			}
		}
		return null;
	}
	
	public ArrayList<Car> GetCarsByModel(String model) {
		ArrayList<Car> result = new ArrayList<Car>();
		for (Car car: parkedCars) {
			if (car.GetModel().equals(model)) {
				result.add(car);
			}
		}
		return result;
	}
}

	
