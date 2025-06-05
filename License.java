package herkansingOop1;

public class License {
	private static int uniqueId = 0;
	private Car licenseHolder;
	private int id;
	private int validGarageId;
	
	public License(Car licenseHolder, int validInGarageId) {
		uniqueId++;
		this.licenseHolder = licenseHolder;
		this.id = uniqueId;
		this.validGarageId = validInGarageId;
	}
	
	public String GetLicenseHolderPlate() {
		return licenseHolder.GetLicensePlate();
	}
	
	public int GetValidInGarageId() {
		return validGarageId;
	}
}
