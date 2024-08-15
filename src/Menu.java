import javax.swing.*;
import java.awt.event.*;

class Menu extends JFrame {
    Menu() {
        this.setTitle("Chop");
        this.setResizable(false);
        this.setSize(640, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        ImageIcon bg = new ImageIcon("bg.png");
        JLabel background = new JLabel(bg);
        this.add(background);

        JButton play = new JButton("Play");
        play.setBounds(270, 300, 100, 50);
        play.setFocusable(false);
        this.add(play);

        JButton quit = new JButton("Quit");
        quit.setBounds(270, 400, 100, 50);
        quit.setFocusable(false);
        this.add(quit);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame gameFrame = new Frame();
                gameFrame.setVisible(true);
                dispose();
            }
        });

        quit.addActionListener(e -> System.exit(0));
        this.setVisible(true);
    }
}
