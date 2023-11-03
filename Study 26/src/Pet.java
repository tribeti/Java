public class Pet extends Shop{

	String name;
	int age;
	
	Pet(String name,String type,int age) {
		super(type);
		this.name = name;
		this.age = age;
	
		}
	
	public String toString() {
		return super.toString() + "\n" + this.name + "\n" + this.age;
	}
}
