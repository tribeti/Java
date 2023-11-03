import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {

	double x = 5.12;
	double y = -4.21;
	
	double z = Math.max(x, y); // tìm max
	double a = Math.abs(y); // tính giá trị tuyệt đối
	double b = Math.sqrt(x); // tính căn
	double c = Math.round(x); // làm tròn
	double d = Math.ceil(x); // lm tròn lên
	double e = Math.floor(x); // lm tròn xuống
	
	//System.out.println(z);
	//System.out.println(a);
	//System.out.println(b);
    //System.out.println(c);
	//System.out.println(d);
	//System.out.println(e);
	
	Scanner scanner = new Scanner(System.in);
	
	double f;
	double g;
	double k;
	
	System.out.println("input f :");
	f = scanner.nextDouble();
	System.out.println("input g :");
	g = scanner.nextDouble();
	
	k = Math.sqrt((f*f+g*g));
    System.out.println("k is :"+k);
	
	}

}
