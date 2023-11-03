import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("va day la florentilo");
			writer.write("Thèn thùng nhìn em quay rót đi mãi\r\n"
					+ "Anh đứng chết lặng trong mưa\r\n"
					+ "Dù rằng bên em đã có ai nhưng nơi đây anh vẫn chờ\r\n"
					+ "Ngọt ngào em trao chẳng thấy nhưng chỉ toàn chua cay \r\n"
					+ "Cố xa những giây phút ngày mà bên nhau bao ước thẹn\r\n"
					+ "Và đây là florentino :))");
			writer.append("\n\n       loi cua da - fo lo ti lo");
			writer.close();
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
