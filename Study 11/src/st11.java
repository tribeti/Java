import java.util.Scanner;

public class st11 {

	public static void main(String[] args) {

		//   &&  : 2 vế điều kiện trong 1 câu phải đúng
		//   ||  : 1 trong 2 vế điều kiện trong 1 câu phải đúng
		//   !   : đảo lại điều kiện trong 1 câu
		
		int temp = 45;
		
		if (temp>=20 && temp<=30) {
			System.out.println("it is ok");
		}
		else if (temp<=30) {
	    	System.out.println("it is cold");
	    }
		else {
        	System.out.println("it is hot ");
        }
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press f or F to pay respect!");
	    String response = scanner.nextLine();
	    if ( response.equals("f") ||  response.equals ("F") )  {
	    	System.out.println("Thank you <3");
	    }
	    else {
	    	System.out.println("wtf bro ? ");
	    }

	    
	
	
	
	
	
	
	
	
	
	
	}

}
