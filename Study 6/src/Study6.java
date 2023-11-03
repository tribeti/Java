import javax.swing.JOptionPane;

public class Study6 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Name ? ");
        JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you ? "));
		JOptionPane.showMessageDialog(null, "You are "+ age+" year old");
		
		double point = Double.parseDouble(JOptionPane.showInputDialog("How much points are you ? "));
		JOptionPane.showMessageDialog(null, "You are "+ point);
		
		}

}
