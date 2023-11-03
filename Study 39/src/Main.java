import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		TimerTask timertask = new TimerTask() {

			int number = 10;
			@Override
			public void run() {
				
				if (number>0) {
					System.out.println(number);
					number--;
				}
				else {
					System.out.println("happy new year :)");
					timer.cancel();
					
				}
				
			}
			
		};
		
		timer.scheduleAtFixedRate(timertask, 0, 1000);
		
		
		
		
		
		
	}

}
