import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private JPanel gamePanel;

    public GameFrame() {
        super("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(900,900 ));
        gamePanel.setBackground(Color.WHITE);
        add(gamePanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
    }
}