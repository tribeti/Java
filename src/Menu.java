import javax.swing.*;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

class Menu extends JFrame {
    Menu () {
        this.setTitle("Chop");
        this.setSize(640, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton play = new JButton("Play");
        play.setBounds(100,300,100,50);
        JButton quit = new JButton("Quit");
        quit.setBounds(100,500,30,50);

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // exit
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(play);
        this.add(quit);
        this.setVisible(true);
    }
}
