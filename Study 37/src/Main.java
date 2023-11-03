import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane pane = new JOptionPane();
		
		JOptionPane.showMessageDialog(null,"HI THERE","one",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"HI THERE","one",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"HI THERE","one",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"HI THERE","one",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,"HI THERE","one",JOptionPane.PLAIN_MESSAGE);

		JOptionPane.showConfirmDialog(null,"hihi","test",JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("name ?");
		System.out.println("hello " + name);
		
		ImageIcon icon = new ImageIcon("happy (1).png");
		String respone [] = {"ok","you","what ever"};
		
		JOptionPane.showOptionDialog(null,"go sleep","nothing",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,respone,0);
	}

}
