public class Vehicle {
	// Attributes
	String brand;
	String name;
	String lisenceNumber;
	int topSpeed;
	int gasCap;
	int wheel;
	
	// Constructor
	public Vehicle(String brand, String name, String lisenceNumber, int topSpeed, int gasCap, int wheel) {
		this.brand = brand;
		this.name = name;
		this.lisenceNumber = lisenceNumber;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheel = wheel;
	}
	
	// Getter and setter
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String name() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLisenceNumber() {
		return lisenceNumber;
	}
	
	public void setLisenceNumber(String lisenceNumber) {
		this.lisenceNumber = lisenceNumber;
	}

	public int getTopSpeed() {
		return topSpeed;
	}
	
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public int getGasCap() {
		return gasCap;
	}
	
	public void setGasCap(int gasCap) {
		this.gasCap = gasCap;
	}
	
	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Method
	public void selling() {}
}
