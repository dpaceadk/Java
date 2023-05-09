import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JPanel implements ActionListener {
    int UIx =10;
    int UIy =10;
    UI(){
        JButton button=new JButton();
        button.addActionListener(this);
        add(button);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(UIx,UIy,100,150);
        g.setColor(Color.RED);
        g.fillRect(200,30,100,150);
        g.setColor(Color.WHITE);
        g.fillRect(110,30,100,150);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
        UIx+=10;
        repaint();
    }
}
