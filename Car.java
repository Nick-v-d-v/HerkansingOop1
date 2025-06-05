package herkansingOop1;

public class Car {
	private String licensePlate;
	private String brand;
	private String model;
	private String colour;
	
	public Car(String licensePlate, String brand, String model, String colour) {
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
	}
	
	public String GetLicensePlate() {
		return licensePlate;
	}
	
	public String GetBrand() {
		return brand;
	}
	
	public String GetModel() {
		return model;
	}
	
	public String GetColour() {
		return colour;
	}
}
