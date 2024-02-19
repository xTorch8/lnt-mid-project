import java.util.Scanner;

public class Motorcycle extends Vehicle {
	// Scanner object
	static Scanner scan = new Scanner(System.in);
	
	// Attributes
	int helm;
	String type;
	
	// Constructor
	public Motorcycle(String brand, String name, String lisenceNumber, int topSpeed, int gasCap, int wheel, int helm, String type) {
		super(brand, name, lisenceNumber, topSpeed, gasCap, wheel);
		this.helm = helm;
		this.type = type;		
	}
	
	// Getter and setter
	public int getHelm() {
		return helm;
	}
	
	public void setHelm(int helm) {
		this.helm = helm;
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
		System.out.println(name + " is standing!");
		
		System.out.println("Enter helm price: ");
		System.out.print(">");
		int helmPrice = scan.nextInt();
		System.out.println("Price: " + helmPrice);
	}
}
