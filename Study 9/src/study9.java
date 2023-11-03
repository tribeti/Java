import java.util.Scanner;

public class study9 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("how long your pp ?");
		int length = scanner.nextInt();
		
		if (length==20) {
		System.out.println("u r ok.");	
		}
		else if (length<=20) {
		System.out.println("u r short.");	
		}
		else if (length>=20) {
		System.out.println("u r big.");	
		}
	}

}
