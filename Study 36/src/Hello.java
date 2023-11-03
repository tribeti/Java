import java.awt.event.*;
import javax.swing.*;

public class Hello {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	ImageIcon icon = new ImageIcon("roll.jpg");
	
	Hello () {
		
		label.setBounds(0,0,100,50);
		label.setIcon(icon);
		label.setOpaque(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setIconImage(icon.getImage());
		frame.add(label);
	}
	
	
}
