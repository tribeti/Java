import javax.swing.*;

class Menu extends JFrame {
    Menu() {
        // Cài đặt tên, kích thước, vị trí cho cửa sổ
        this.setTitle("Chop");
        this.setResizable(false);
        this.setSize(640, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0, 0, 640, 800);
        this.setContentPane(layer);

        // nền
        ImageIcon bg = new ImageIcon( "./img/bg.png");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 640, 800);
        layer.add(background, 1);

        // nút
        JButton play = createStyledButton("Play", 270, 500);
        layer.add(play, Integer.valueOf(1));

        JButton quit = createStyledButton("Quit", 270, 600);
        layer.add(quit, Integer.valueOf(1));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // hành động của nút play và quit
        play.addActionListener(e -> {
            Frame gameFrame = new Frame();
            gameFrame.setVisible(true);
            dispose();
        });

        quit.addActionListener(e -> System.exit(0));
        this.setVisible(true);
    }

    // hàm tạo nút
    private JButton createStyledButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 100, 50);
        button.setFocusable(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        return button;
    }
}
