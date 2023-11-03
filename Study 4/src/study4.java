import java.util.Scanner; //thêm Scanner để trả lời và sử dụng câu trả lời

public class study4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // thêm scanner mới
		
		System.out.println("What is your bitch name ?"); // nhập câu hỏi
		String name = scanner.nextLine(); // định dạng loại câu trả lời
		System.out.println("Fuck you, "+name); //thêm tí mắm muối
	
		System.out.println("How long your dick ?"); // nhập câu hỏi
		int number = scanner.nextInt(); //định dạng loại câu trả lời
		System.out.println( "Oh "+number + " cm, really?"); //thêm tí mắm muối
		scanner.nextLine(); //xóa dữ liệu của dòng nextLine trước
	   
		System.out.println("Are u ok ?"); // nhập câu hỏi
        String feel = scanner.nextLine(); // định dạng loại câu trả lời
	    System.out.println("Oh, I see you are "+feel); //thêm tí mắm muối
        }

}
