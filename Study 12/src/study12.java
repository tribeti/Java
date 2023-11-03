import java.util.Scanner;

public class study12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String food = "";
		
		while(food.isBlank()) {
		 System.out.print("What is your fav food ? ");
		 food = scanner.nextLine();
		}
		
		System.out.println("your fav food is "+ food);
		
	
	}
	
	
	

}
