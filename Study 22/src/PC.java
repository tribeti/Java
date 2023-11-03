
public class PC {

	String brand;
	double price;
	int year;
	
	PC(String brand,double price,int year) {
		
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	void turnon () {
		System.out.println(this.brand +" is on ");
	}
	void turnoff () {
		System.out.println(this.brand + " is off ");
	}
	void explode() {
		System.out.println( "the "+this.brand+" is exploding ");
	}

}
