import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener {

	JButton button;

	Frame() {
		
		ImageIcon icon = new ImageIcon("happy (1).png");
		
		button = new JButton();
		button.setBounds(200,200,150,75);
		button.addActionListener(this);
		button.setText("Click this");
		button.setFocusable(false);
		button.setEnabled(true);
		button.setBackground(Color.orange);
		button.setForeground(Color.black);
		button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.CENTER);
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			System.out.println("what");
			//button.setEnabled(false);
			
		}
		
	}
}
