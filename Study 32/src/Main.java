import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		File file = new File("Rick Astley  Never Gonna Give You Up Official Music Video_1080p.wav");
		AudioInputStream audio = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audio);
		
		
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("P to Play, S to Stop, R to Reset, Q to Quit");
			System.out.println("Choose one");
			
	        response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
			case ("P"): clip.start();
			break;
			case ("S"): clip.stop();
			break;
			case ("R"): clip.setMicrosecondPosition(0);
			break;
			case ("Q"): clip.close();
			break;
			default: System.out.println("again");
		}
			
		} 
		
	} 

} 
