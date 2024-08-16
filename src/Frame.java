import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame {
    private int clickCount = 0;
    private final JLabel clickCountLabel;
    private final JLayeredPane layer;

    Frame() {
        // Cài đặt tên, kích thước, vị trí cho cửa sổ
        this.setTitle("Chop");
        this.setResizable(false);
        this.setSize(640, 800);
        this.setLocationRelativeTo(null);
        // Cho cửa sổ tắt hoàn toàn khi bấm nút thoát
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo 1 cái nền có lớp và thêm tất cả vào cửa sổ
        layer = new JLayeredPane();
        this.setContentPane(layer);

        // Nền
        ImageIcon bg = new ImageIcon("./img/grass.png");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 640, 800);

        // Vật thể (gỗ)
        ImageIcon w = new ImageIcon("./img/wood.png");
        JLabel wood = new JLabel(w);

        // Đặt vị trí của wood ở giữa màn hình
        int woodX = (640 - w.getIconWidth()) / 2;
        int woodY = (800 - w.getIconHeight()) / 2;
        wood.setBounds(woodX, woodY + 50, w.getIconWidth(), w.getIconHeight());

        // Thêm MouseListener cho wood
        wood.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount++;
                updateClickCountLabel();
                if (clickCount == 10000) {
                    showWinScreen();
                }
            }
        });

        // Tạo label để hiển thị số lần click
        clickCountLabel = new JLabel("0");
        clickCountLabel.setFont(new Font("Arial", Font.BOLD, 48));
        clickCountLabel.setForeground(Color.BLACK);
        clickCountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clickCountLabel.setBounds(0, 50, 640, 60);

        // Thêm các thành phần vào layer
        layer.add(background, Integer.valueOf(1));
        layer.add(wood, Integer.valueOf(2));
        layer.add(clickCountLabel, Integer.valueOf(3));

        // Cho cửa sổ hiển thị được
        this.setVisible(true);
    }

    // Cập nhật điểm
    private void updateClickCountLabel() {
        clickCountLabel.setText(String.valueOf(clickCount));
    }

    // hiển thị màn hình khi thắng
    private void showWinScreen() {
        layer.removeAll();

        JLabel winLabel = new JLabel("Bạn đã thắng!");
        winLabel.setFont(new Font("Arial", Font.BOLD, 48));
        winLabel.setForeground(Color.WHITE);
        winLabel.setHorizontalAlignment(SwingConstants.CENTER);
        winLabel.setBounds(0, 0, 640, 800);

        ImageIcon img = new ImageIcon("./img/mep.jpg");
        JLabel meo = new JLabel(img);

        JPanel winPanel = new JPanel();
        winPanel.setBackground(Color.BLACK);
        winPanel.setBounds(0, 0, 640, 800);
        winPanel.setLayout(new BorderLayout());
        winPanel.add(winLabel, BorderLayout.CENTER);
        winPanel.add(meo);

        layer.add(winPanel, Integer.valueOf(1));
        layer.repaint();
    }
}