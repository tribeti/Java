import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("D:/readme.txt");
		
		if(file.exists()) {
			System.out.println("ok");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		}
		else {
			System.out.println(":(");
		}
		
	}
	

}
