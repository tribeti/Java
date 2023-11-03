package pack1;

public class class1 {

	public static void main(String[] args) {
		
		Human human1 = new Human("bi",6);
		Human human2 = new Human("bo",10);

		human1.copy(human2);
		
		System.out.println(human1);
		System.out.println(human2);
		System.out.println();
		System.out.println(human1.getAge());
		System.out.println(human2.getAge());
		System.out.println();
		System.out.println(human1.getName());
		System.out.println(human2.getName());
		



             }
}