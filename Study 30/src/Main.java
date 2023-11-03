import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter number");
			int x = scanner.nextInt();
			System.out.println("Enter number to divide");
			int y = scanner.nextInt();
			
			int z = x/y;
			System.out.println("Result : "+ z);
			
		}
		catch(Exception e) {
			System.out.println("Try again");
		}
		
		finally {
			scanner.close();
		}

	}

}
