import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Vehicle vehicle;
		
		System.out.println("Choose your vehicle ");
		System.out.println("1 for car, 2 for bike");
        int choice = scanner.nextInt();
		
		if(choice == 1 ) {
			vehicle = new Car();
			vehicle.go();
		}
		else if(choice == 2 ) {
			vehicle = new Bike();
			vehicle.go();
		}
		else {
			vehicle = new Vehicle();
			vehicle.go();
		}
		

	}

}
