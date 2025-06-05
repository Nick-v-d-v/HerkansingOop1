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
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public String getbrand() {
		return brand;
	}
	
	public String getmodel() {
		return model;
	}
	
	public String getcolour() {
		return colour;
	}
}
