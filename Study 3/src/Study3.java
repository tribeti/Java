
public class Study3 {

	public static void main(String[] args) {  //mục tiêu đổi nd của x và y
		String x = "Coal";
        String y = "Iron";
        String temp=null; // khai báo temp nội dung trống
         
        temp=x; // đẩy nd từ x sang temp
        x=y; // đẩy nd từ y sang x
        y=temp; // đẩy nd từ temp sang y
        
        System.out.println("x : "+ x); //in ra
        System.out.println("y : "+ y);
        }
	}
