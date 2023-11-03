
public class study21 {

	public static void main(String[] args) {
	
	boolean one = true;
	char two = '#';	
	int three = 7;	
	String four = "hi";
	double five = 300000.14;
	
	//System.out.printf("%b", one);         // dạng % đi với mỗi loại biến
	//System.out.printf("%c", two);
	//System.out.printf("%d", three);
	//System.out.printf("%s", four);
	//System.out.printf("%f", five);
	
	//System.out.printf("hi%5s",four);   // thêm khoảng cách giữa giá trị biến và dãy kí tự
	
	//System.out.printf("%.2f", five);   // giới hạn phần thập phân 
	
	//System.out.printf("%020f", five);   // thêm số 0 ở trước
	
	System.out.printf("%,f", five);     // thêm dấu phẩy mỗi 1000
	
	
	
	}

}
