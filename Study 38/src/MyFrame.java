import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JTextField textfield;
	
	MyFrame() {
		
	    textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(200,100));
		textfield.setText("name ?");
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		
		JFrame frame = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("name ?");
		this.setLayout(new FlowLayout());
		this.pack();
		this.setLocation(300,200);
		this.setVisible(true);
		this.add(textfield);
		this.add(button);
		
				
	}
	
		@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			textfield.getText();
			button.setEnabled(false);
			textfield.setEnabled(false);
			System.out.println("hi "+textfield.getText());
		}
		
	}

}
