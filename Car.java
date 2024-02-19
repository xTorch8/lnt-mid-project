public class Car extends Vehicle {
	// Attributes
	int entertainmentSystem;
	String type;
	
	// Constructor
	public Car(String brand, String name, String lisenceNumber, int topSpeed, int gasCap, int wheel, int entertainmentSystem, String type) {
		super(brand, name, lisenceNumber, topSpeed, gasCap, wheel);
		this.entertainmentSystem = entertainmentSystem;
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	// Getter and setter
	public int getEntertainmentSystem() {
		return entertainmentSystem;
	}
	
	public void setEntertainmentSystem(int entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	// Override function
	@Override
	public void selling() {
		System.out.println("Turning on entertainment system...");
		
		if (type.toLowerCase().compareTo("supercar") == 0) {
			System.out.println("Boosting!");
		}
	}
}
