import java.util.ArrayList;

public class study18 {

	public static void main(String[] args) {
	
	ArrayList<String> toys = new ArrayList<String>();
		
	toys.add("lego");
	toys.add("cars");	
	toys.add("cards");	
	
	toys.set(0, "yoyo"); // thế chỗ của vị trí
	toys.remove(1); // xóa vị trí
	toys.clear(); // xóa sạch
	
	for(int i=0; i<toys.size(); i++) {
		System.out.println(toys.get(i));
	}
		
	}
}
