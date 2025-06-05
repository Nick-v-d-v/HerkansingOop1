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
}
