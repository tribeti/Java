import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		
		JFrame frame = new JFrame(); 
		
		//JPanel panel1 = new JPanel();
		//JPanel panel2 = new JPanel();
		
		
		Border border = BorderFactory.createLineBorder(new Color(139,69,19),4,true);
		
		ImageIcon icon1 = new ImageIcon("Untitled.png");
		ImageIcon icon2 = new ImageIcon("chad.jpg");
		
		
		//panel1.setBackground(Color.black);
		//panel1.setBounds(250,250,100,100);
		
		//panel2.setBackground(Color.yellow);
		//panel2.setBounds(100, 100, 100, 100);
		
		
		label.setText("OK :3");
		label.setIcon(icon2);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(255,0,0));
		label.setFont(new Font("Gardener",Font.PLAIN,40));
		label.setIconTextGap(50);
		label.setBackground(new Color(255,255,0));
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		frame.setTitle("Chatbox");
		frame.setVisible(true);
		//frame.setLayout(null);
		frame.resize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSEE);
		frame.setResizable(true);
		frame.setIconImage(icon1.getImage());
		frame.getContentPane().setBackground(new Color(255,215,0));
		frame.add(label);
		
		
		//panel2.add(label);
		//frame.add(panel1);
		//frame.add(panel2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//frame.pack();    khởi động bằng với size của ảnh và chữ

		
		
		
		

		
		

	}

}
