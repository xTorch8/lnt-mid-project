import java.util.Scanner;
import java.util.ArrayList;

public class Index {
	// Scanner object
	static Scanner scan = new Scanner(System.in);

	ArrayList<Car> carList = new ArrayList<>();
	ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
	
	public static boolean isCar(String vehicleType) {
		return (vehicleType.toLowerCase().compareTo("car") == 0);
	}
	
	public static boolean isVehicleTypeValid(String vehicleType) {
		return (vehicleType.toLowerCase().compareTo("car") == 0) || (vehicleType.toLowerCase().compareTo("motorcycle") == 0);
	}
	
	public static boolean isBrandValid(String brand) {
		return (brand.length() >= 5);
	}
	
	public static boolean isTopSpeedValid(int speed) {
		return (speed >= 100 && speed <= 250);
	}
	
	public static boolean isGasCapacityValid(int gasCapacity) {
		return (gasCapacity >= 30 && gasCapacity <= 60);
	}
	
	public static boolean isWheelValid(int wheel, boolean isCar) {
		if (isCar == true) {
			return (wheel >= 4 && wheel <= 6);
		} 
		else {
			return (wheel >= 2 && wheel <= 3);
		}
	}

	public static boolean isTypeValid(String type, boolean isCar) {
		if (isCar == true) {
			return (type.toLowerCase().compareTo("suv") == 0 || type.toLowerCase().compareTo("supercar") == 0 || type.toLowerCase().compareTo("minivan") == 0); 
		}
		else {
			return (type.toLowerCase().compareTo("manual") == 0 || type.toLowerCase().compareTo("automatic") == 0);
		}
	}
	
	// Input menu
	public static void inputMenu() {
		String vehicleType;
		String brand;
		String name;
		String license;
		int topSpeed;
		int gasCapacity;
		int wheel;
		String type;
		int entertainmentSystem;
		int helm;
		
		boolean isCar;
		
		// Input type and validation
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			vehicleType = scan.nextLine();
			
			if (isVehicleTypeValid(vehicleType) == false) {
				System.out.println("Invalid input!");
			}
		} while (isVehicleTypeValid(vehicleType) == false);
		
		isCar = isCar(vehicleType);
		
		// Input brand and validation
		do {
			System.out.print("Input brand [>= 5]: ");
			brand = scan.nextLine();
			
			if (isBrandValid(brand) == false) {
				System.out.println("Invalid input!");
			}
			
		} while (isBrandValid(brand) == false);
		
		// Input name and validation
		do {
			System.out.print("Input name [>= 5]: ");
			name = scan.nextLine();
			
			if (isBrandValid(name) == false) {
				System.out.println("Invalid input!");
			}
			
		} while (isBrandValid(name) == false);	
		
		// Input license
		// FIXME: Have not made the validation yet
		System.out.print("Input lisence: ");
		license = scan.nextLine();
		
		// Input top speed and validation
		do {
			System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
			topSpeed = scan.nextInt();
			
			if (isTopSpeedValid(topSpeed) == false) {
				System.out.println("Invalid input!");
			}
			
		} while (isTopSpeedValid(topSpeed) == false);
		
		// Input gas capacity and validation
		do {
			System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCapacity = scan.nextInt();
			
			if (isGasCapacityValid(gasCapacity) == false) {
				System.out.println("Invalid input!");
			}
			
		} while (isGasCapacityValid(gasCapacity) == false);		
		
		// Input wheel and validation
		do {
			if (isCar == true) {
				System.out.print("Input wheel [4 <= wheel <= 6]: ");	
			}
			else {
				System.out.print("Input wheel [2 <= wheel <= 3]: ");	
			}
			
			wheel = scan.nextInt();
			if (isWheelValid(wheel, isCar) == false) {
				System.out.println("Invalid input!");
			}
			
		} while (isWheelValid(wheel, isCar) == false);			
		
		
	}
	
	// View menu
	public static void viewMenu() {
		
	}
	
	// Main menu
	public static int mainMenu() {
		System.out.println("--- Choose Menu ---");
		System.out.println("1. Input");
		System.out.println("2. View");
		System.out.println("3. Exit");
		System.out.print("> ");
		
		int menuChosen = scan.nextInt();
		if (menuChosen < 1 || menuChosen > 3) {
			System.out.println("Invalid. Please choose number 1-3");
		}
		else if (menuChosen == 3) {
			System.out.println("Thank you for using this application");
		}
		else {
			if (menuChosen == 1) {
				inputMenu();
			}
			else if (menuChosen == 2) {
				viewMenu();
			}
		}
		
		return menuChosen;
	}
	
	public static void main(String[] args) {
		int menuChosen;
		do {
			menuChosen = mainMenu();
		} while (menuChosen != 3);
		
	}
}
