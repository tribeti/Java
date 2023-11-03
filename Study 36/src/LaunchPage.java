import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton("Click this");
	
	LaunchPage () {
		
		button.setBounds(0,0,100,10);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			frame.dispose();
			Hello hello = new Hello();
		}
		
		
	}
}
